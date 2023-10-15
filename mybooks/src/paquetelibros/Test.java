package paquetelibros;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {

		// Creación de libros

		Libro lib0 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, false, 20.99);
		Libro lib1 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, false, 22.99);
		Libro lib2 = new Libro("1984", "George Orwel", 122, 9, false, 40.99);
		Libro lib3 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, false, 25.99);
		Libro lib4 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, true, 12.99);
		Libro lib5 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, false, 60.99);
		Libro lib6 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, false, 27.99);
		Libro lib7 = new Libro("Ulises", "James Joyce", 400, 4, false, 42.99);
		Libro lib8 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, true, 9.99);
		Libro lib9 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, true, 9.99);

		// Creacion de revistas

		Revista rev0 = new Revista("Muy Interesante", 50, 1, true, 3.95);
		Revista rev1 = new Revista("Inked Magazine", 79, 1, true, 9.99);
		Revista rev2 = new Revista("Vandal", 99, 1, true, 5.99);
		Revista rev3 = new Revista("Todo Hogar", 40, 1, false, 4.99);
		Revista rev4 = new Revista("Yuzin", 90, 1, false, 1.00);

		// Array de publicaciones

		Publicacion[] publicaciones = { lib0, lib1, lib2, lib3, lib4, lib5, lib6, lib7, lib8, lib9, rev0, rev1, rev2,
				rev3, rev4 };

		// Obtener una serie de listados de publicaciones según se expresa a
		// continuación:

		// Todas las publicaciones del array publicaciones con título y ID.

		System.out.println("Todas las publicaciones del array publicaciones con título y ID");
		for (int i = 0; i < publicaciones.length; i++)
			System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID());

		// Solo libros del array publicaciones con ID y título.

		System.out.println();
		System.out.println("Solo libros del array publicaciones con ID y título.");
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Libro)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID());

		// Solo revistas del array publicaciones con ID y título.
		System.out.println();
		System.out.println("Solo revistas del array publicaciones con ID y título.");
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Revista)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID());

		// Todas las publicaciones del array publicaciones con ID, título y precio pero
		// filtrando aquellas que tienen un precio mayor de 20 euros.

		System.out.println();
		System.out.println(
				"Todas las publicaciones del array publicaciones con ID, título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros. ");
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i].getPrecio() > 20.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		// Solo libros del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 20 euros.
		System.out.println();
		System.out.println(
				"Solo libros del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.");
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Libro && publicaciones[i].getPrecio() > 20.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		// Solo revistas del array publicaciones con ID y título y precio pero filtrando
		// aquellas que tienen un precio mayor de 3 euros.
		System.out.println();
		System.out.println(
				"Solo libros del array publicaciones con ID y  título y precio pero filtrando aquellas que tienen un precio mayor de 20 euros.");
		for (int i = 0; i < publicaciones.length; i++)
			if (publicaciones[i] instanceof Revista && publicaciones[i].getPrecio() > 3.00)
				System.out.println("Titulo: " + publicaciones[i].getTitulo() + " con ID: " + publicaciones[i].getID()
						+ " Precio: " + publicaciones[i].getPrecio());

		// Todo el proceso anterior pero usando ArrayList(¡Justo cuando creía que estaba
		// por terminar, vivaaa!)

		// Hacemos el arraylist de publicacionrs

		ArrayList<Publicacion> arrayListPublicaciones = new ArrayList<Publicacion>();
		for (int i = 0; i < publicaciones.length; i++) {
			arrayListPublicaciones.add(publicaciones[i]);
		}

		// Todas las publicaciones del array publicaciones con título y ID.

		System.out.println();
		System.out.println("ArrayList: Todas las publicaciones con título y ID:");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			Publicacion publicacion = arrayListPublicaciones.get(i);
			System.out.println("Título: " + publicacion.getTitulo() + " con ID: " + publicacion.getID());
		}

		// Solo **libros** del array `publicaciones` con `ID` y `título`.

		System.out.println();
		System.out.println("ArrayList: Solo libros con ID y título:");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			if (arrayListPublicaciones.get(i) instanceof Libro) {
				Libro libro = (Libro) arrayListPublicaciones.get(i);
				System.out.println("Título: " + libro.getTitulo() + " con ID: " + libro.getID());
			}
		}

		// Solo **revistas** del array `publicaciones` con `ID` y `título`.

		System.out.println();
		System.out.println("ArrayList: Solo revistas con ID y título:");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			if (arrayListPublicaciones.get(i) instanceof Revista) {
				Revista revista = (Revista) arrayListPublicaciones.get(i);
				System.out.println("Título: " + revista.getTitulo() + " con ID: " + revista.getID());
			}
		}

		// Todas las **publicaciones** del array `publicaciones` con `ID,` `título` y
		// `precio` pero filtrando aquellas que tienen un precio mayor de 20 euros.

		System.out.println();
		System.out.println("ArrayList: Todas las publicaciones con ID, título y precio (precio > 20 euros):");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			Publicacion publicacion = arrayListPublicaciones.get(i);
			if (publicacion.getPrecio() > 20) {
				System.out.println("Título: " + publicacion.getTitulo() + " con ID: " + publicacion.getID()
						+ " y Precio: " + publicacion.getPrecio() + " €");
			}
		}

		// Solo **libros** del array `publicaciones` con `ID` y `título` y `precio` pero
		// filtrando aquellas que tienen un precio mayor de 20 euros.

		System.out.println();
		System.out.println("ArrayList:Solo libros con ID, título y precio (precio > 20 euros):");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			if (arrayListPublicaciones.get(i) instanceof Libro) {
				Libro libro = (Libro) arrayListPublicaciones.get(i);
				if (libro.getPrecio() > 20) {
					System.out.println("Título: " + libro.getTitulo() + " con ID: " + libro.getID() + " y Precio: "
							+ libro.getPrecio() + " €");
				}
			}
		}

		// Solo **revistas** del array `publicaciones` con `ID` y `título` y `precio`
		// pero filtrando aquellas que tienen un precio mayor de 3 euros.

		System.out.println();
		System.out.println("6. Solo revistas con ID, título y precio (precio > 3 euros):");
		for (int i = 0; i < arrayListPublicaciones.size(); i++) {
			if (arrayListPublicaciones.get(i) instanceof Revista) {
				Revista revista = (Revista) arrayListPublicaciones.get(i);
				if (revista.getPrecio() > 3) {
					System.out.println("Título: " + revista.getTitulo() + " con ID: " + revista.getID() + " y Precio: "
							+ revista.getPrecio() + " €");
				}
			}
		}

		// Verificación de lectura y métodos de presentación correctos:
		// 1. Utiliza el libro Ulises, pero dentro del array. No utilices lib7.
		// 2. Muestra su estado con show.
		System.out.println();
		System.out.println("ULISES");
		publicaciones[7].show();

		// 3. Lee 300 palabras de forma silenciosa con el método estático y verifica que
		// estás en la página 304.
		System.out.println();
		System.out.println(
				"Lee 300 páginas de forma silenciosa con el método estático y verifica que estás en la página 304.");
		for (int i = 0; i < 304; i++) {
			Publicacion.leePaginaStatic(publicaciones[7], true);
		}
		publicaciones[7].show();

		// 4. Lee 5 palabras de forma NO silenciosa con el método estático y verifica
		// que estás en la página 309.

		System.out.println();
		System.out.println(
				"Lee 5 páginas de forma NO silenciosa con el método estático y verifica que estás en la página 309.");
		for (int i = 0; i < 5; i++) {
			Publicacion.leePaginaStatic(publicaciones[7], false);
		}

		publicaciones[7].show();

		// 5. Lee 10 palabras de forma NO silenciosa con el método NO estático y
		// verifica que estás en la página 310.

		System.out.println();
		System.out.println(
				"Lee 10 páginas de forma NO silenciosa con el método NO estático y verifica que estás en la página 310."); //Entiendo que hay una errata en el enunciado, querías decir 319?

		for (int i = 300; i < 310; i++) {
			publicaciones[7].leePagina(false);
		}
		publicaciones[7].show();

		// 6. Lee 1000 palabras con el método NO estático y verifica que figura como
		// leído y está en la página 400.

		System.out.println();
		System.out.println(
				"Lee 1000 páginas de forma NO silenciosa con el método NO estático y verifica que estás en la página 400.");

		for (int i = 0; i < 1000; i++) {
			publicaciones[7].leePagina(false);
		}
		publicaciones[7].show();

	}
}
