/**

Clase LeerPorTeclado permite la lectura de un carácter por teclado y procesa excepciones
según el tipo de caracter leido: vocal, número, espacio en blanco o caracter de salida.
*/
package ejercicioGestionExcepciones;

import java.util.Scanner;

public class LeerPorTeclado {

	private char caracterLeido;

	/**
	 * Lee un carácter desde la entrada estándar del sistema y verifica si es una
	 * vocal, un número, un espacio en blanco o un caracter de salida, lanzando una
	 * excepción correspondiente en cada caso.
	 * 
	 * @return el caracter leido
	 * @throws ExcepcionVocal  si se ha leido una vocal
	 * @throws ExcepcionNumero si se ha leido un número
	 * @throws ExcepcionBlanco si se ha leido un espacio en blanco
	 * @throws ExcepcionSalida si se ha leido el caracter de salida
	 */
	public char getChar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
		Scanner sc = new Scanner(System.in);
		this.caracterLeido = sc.next().charAt(0);

		// Procesamiento de excepción según el caracter leido:

		if (esVocal(this.caracterLeido)) {
			throw new ExcepcionVocal("Se ha leido una vocal");
		} else if (esNumero(this.caracterLeido)) {
			throw new ExcepcionNumero("Se ha leido un número");
		} else if (esBlanco(this.caracterLeido)) {
			throw new ExcepcionBlanco("Se ha leido un espacio en blanco");
		} else if (esSalida(this.caracterLeido)) {
			throw new ExcepcionSalida("Se ha leido el caracter de salida");
		}

		return this.caracterLeido;
	}

	/**
	 * Verifica si el caracter dado es una vocal (mayúscula o minúscula).
	 * 
	 * @param c el caracter a evaluar
	 * @return true si es una vocal, false en caso contrario
	 */
	private boolean esVocal(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U';
	}

	/**
	 * Verifica si el caracter dado es un número.
	 * 
	 * @param c el caracter a evaluar
	 * @return true si es un número, false en caso contrario
	 */
	private boolean esNumero(char c) {
		return Character.isDigit(c);
	}

	/**
	 * Verifica si el caracter dado es un espacio en blanco.
	 * 
	 * @param c el caracter a evaluar
	 * @return true si es un espacio en blanco, false en caso contrario
	 */
	private boolean esBlanco(char c) {
		return Character.isWhitespace(c);
	}

	/**
	 * Verifica si el caracter dado es el caracter de salida "x".
	 * 
	 * @param c el caracter a evaluar
	 * @return true si es el caracter de salida, false en caso contrario
	 */
	private boolean esSalida(char c) {
		return c == 'x';
	}
}