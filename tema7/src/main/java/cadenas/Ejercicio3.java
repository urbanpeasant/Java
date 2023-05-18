package cadenas;

// 3.- Pedir una cadena cad por consola y un caracter car, verificar cuántas veces se repite el carácter car en la cadena cad, por ejemplo: Entrada: cad = "casa blanca", car = 'a' .Salida: El caracter 'a' se repite 4 veces




//NOTA PARA ALEX: En este ejercicio tengo el mismo problema que en el de los arrays. Me da un source leak argumentando que scanner nunca se cierra. Si uso el .close no funciona el código. En el ejercicio1 no me pasa porque tuve en cuenta excepciones de número y espacio en blanco y lo metí en el finally, pero aquí no se como implementarlo.


import java.util.Scanner;

public class Ejercicio3 {

	
	//Método para pedir la cadena al usuariio
	public static String pedirCadena() {
		System.out.println("Introduce una cadena");
		Scanner escaneo = new Scanner(System.in);
		String s = escaneo.next();
		return s;
	}

	
	//Método para pedir el caracter a contar al usuario
	public static char pideLetra() {

		String letra = null;
		boolean pideCaracter = true;
		while (pideCaracter) {
			System.out.println("Introduce un caracter");
			Scanner sc = new Scanner(System.in);
			letra = sc.next();
			if (letra.length() == 1)
				pideCaracter = false;
		}
		return letra.charAt(0);

	}

	//Método para recorrer la cadena y ver qué letra se repite
	public static int recorreCadena(String s, char c) {
		int contador = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c)
				contador++;
		}

		return contador;
	}

	public static void main(String[] args) {
		String cadena = pedirCadena();
		char letra = pideLetra();
		System.out.println("El caracter " + letra + " en la cadena: " + cadena + " aparece: " + recorreCadena(cadena, letra) + " veces.");
	}

}