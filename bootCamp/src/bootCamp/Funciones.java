package bootCamp;

public class Funciones {
	
	// Las funciones son agrupaciones de sentencias que van a poder ser reutilizadas desde cualquier punto de nuestra app.
	
	public static void holaMundo() {// es void porque no devuelve nada. Static indica que pertenece a la clase, son métodos invocados que no necesitan crear objetos para ello.
		System.out.println("Hola mundo"); //Esta función imprime el hola mundo. Desde el main simplemente tenemos que invocar la función.
	}

	public static void holaMundoNombre(String name) {//Aquí le pasamos los parámetros, le indicamos que va a recibir un parámetro de tipo String, que es un nombre.
		System.out.println("Hola " + name);
	}
	
	private static String devolverHola() {
		return "Hola"; //esto devuelve el texto, aunque no imprime.
	}
	
	public static void main(String[] args) {
		
		
		holaMundo(); //Aquí llamamos la función que hemos creado arriba.
		holaMundoNombre("Jose");// Aquí invocamos la función y le pasamos los parámetros, en este caso un nombre, previamente declarado como String.
		holaMundoNombre("Lola");
		String hola = devolverHola();
		System.out.println(hola);

	}
	
}
