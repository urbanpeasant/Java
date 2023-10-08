package bucles;

//Realiza utilizando bucles for un pequeño programa cuya salida sea como la que puedes ver a continuación.

/*
 * a) Entre 50 y 2500 hay XX números múltiplos de 13.
b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es:
   XX XX ... XX
c) El producto de los números impares entre 10 y 20 es XX.
d) La suma de los números entre 70 y 800 es XXX.

f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
h) El abecedario inglés de letras minúsculas es:
   abcdefghijklmnopqrstuvwxyz
i) El abecedario inglés de letras mayúsculas es:
   ABCDEFGHIJKLMNOPQRSTUVWXYZ
j) El abecedario inglés de letras minúsculas de 3 en 3 letras es:
   adgjmpsvy
k) El abecedario inglés de letras minúsculas alrevés es:
   zyxwvutsrqponmlkjihgfedcba
l) El abecedario inglés alternando mayúsculas y minúsculas es:
   AbCdEfGhIjKlMnOpQrStUvWxYz
 * */

public class Bucles {

	
	//main
	
	public static void main(String[] args) {
		contarAtras();
		calcularProductoImpares();
		sumaNumeros();
		
		abecedarioMinusculas();
		abecedarioMayuculas();
		abecedarioMinusculas3en3();
		abecedarioMinusculasReves();
		
	}
	
	// Métodos:

	// a) Entre 50 y 2500 hay XX números múltiplos de 13.

	public static void cuentaMultiplos() {
		int contadorDe13 = 0;
		for (int i = 50; i <= 2500; i++) {
			if (i % 13 == 0) {
				contadorDe13++;
			}
		}

		System.out.print("a) Entre 50 y 2500 hay " + contadorDe13 + " múltiplos de 13");
	}

	// b) La cuenta atrás de 7 en 7 desde 1935 a 1812 es: XX XX ... XX
	
	public static void contarAtras() {
		System.out.println("b) La cuenta hacia atrás de 7en 7 desde 1935 a 1812 es: ");
		for (int i = 1935; i>= 1812; i -= 7){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	// c) Calcular el producto de los números impares entre 10 y 20
	
	public static void calcularProductoImpares() {
		int productoImpares = 1;
		for (int i = 11; i <= 19; i += 2) {
			productoImpares *= i;
		}
		System.out.println("c) El producto de los númerpos impares entre 10 y 20 es " + productoImpares);
	}
	
	
	//d) La suma de los números entre 70 y 800 es XXX.
	
	public static void sumaNumeros() {
		int sumaNumeros = 0;
		for (int i = 70; i <= 800; i++) {
			sumaNumeros += i;
		}
		System.out.println("d) La suma de números que hay entre 70 y 800 es " + sumaNumeros);
	}
	
	//f) La suma de los cuadrados de los numeros pares entre 15 y 70 es XXX.
	
	public static void sumaCuadradosPares() {
		int sumaCuadradosPares = 0;
		for (int i = 16; i <= 70; i+= 2) {
			sumaCuadradosPares += i * i;
		}
		
		System.out.println("f) La suma de los cuadrados de los números pares entre 15y 70 es " + sumaCuadradosPares);
	}
	
	// g) La suma de los cubos de los numeros impares entre -10 y 20 es XXX.
	
	public static void calculaCubosImpares() {
		int sumaCubosImpar = 0;
		for (int i = -9; i <= 19; i += 2) {
			sumaCubosImpar += i * i *i;
		}
		System.out.println("g) La suma de los cubos de los imapres es " + sumaCubosImpar);
	}
	
	//h) El abecedario inglés de letras minúsculas es: abcdefghijklmnopqrstuvwxyz
	
	public static void abecedarioMinusculas() {
		System.out.print("h) El abecedario inglés en minusculas es: ");
		for (char i = 'a'; i <= 'z'; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	//i) El abecedario en ingles en mayúsculas
	
	public static void abecedarioMayuculas() {
		System.out.print("h) El abecedario inglés en mayúsculas es: ");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
		System.out.println();
	}
	
	// j) El abecedario inglés de letras minúsculas de 3 en 3 letras es: adgjmpsvy
		   
	public static void abecedarioMinusculas3en3() {
		System.out.print("h) El abecedario inglés en minusculas de 3 en 3 es: ");
		for (char i = 'a'; i <= 'z'; i+=3) {
			System.out.print(i);
		}
		System.out.println();
	}
		   
	// k) El abecedario inglés de letras minúsculas alrevés es: zyxwvutsrqponmlkjihgfedcba
	
	public static void abecedarioMinusculasReves() {
		System.out.print("h) El abecedario inglés hacia atrás es: ");
		for (char i = 'z'; i >= 'a'; i --) {
			System.out.print(i);
		}
		System.out.println();
	}
	
	// l)El abecedario inglés alternando mayúsculas y minúsculas es: AbCdEfGhIjKlMnOpQrStUvWxYz
	
	/* public static void alternaMayus() {
		System.out.println("l) El abecedario alternando mayúsculas y minúsculas es: ");
		for (char i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
			System.out.print(Character.toLowerCase(i));
		}
	}
	
	Este código está mal, así imprimo las letras de las dos formas, hay que alternar.*/
	
	public static void imprimirAbecedarioAlternado() {
	    System.out.print("k) El abecedario inglés alternando mayúsculas y minúsculas es: ");
	    boolean mayuscula = true; // Variable buleana para alternar (Es correcot?)
	    
	    for (char letra = 'A'; letra <= 'Z'; letra++) {
	        if (mayuscula) {
	            System.out.print(letra); // Imprime la letra en mayúscula porque enrta en el if
	        } else {
	            System.out.print(Character.toLowerCase(letra)); // Imprime la letra en minúscula
	        }
	        mayuscula = !mayuscula; // Cambia la alternancia para la siguiente letra
	    }
	    
	    System.out.println(); // Agrega una nueva línea al final para que la salida sea más legible.
	}

}
