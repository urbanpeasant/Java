/**

Esta clase permite calcular el volumen de diferentes formas geométricas.
Se pueden calcular el volumen de un prisma rectangular, una esfera o un cubo.
Los valores de las medidas de los objetos se solicitan al usuario a través de la entrada estándar.
El resultado se muestra por pantalla con dos decimales.
*/
package javadocPruebas;
import java.util.*;

public class Volumen {


/**
 * Longitud del prisma.
 */
static double l;

/**
 * Anchura del prisma.
 */
static double w;

/**
 * Altura del prisma.
 */
static double h;

/**
 * Radio de la esfera.
 */
static double r;

/**
 * Diámetro de la esfera.
 */
static double d;

/**
 * Volumen del objeto.
 */
static double V;

/**
 * Opción elegida por el usuario para calcular el volumen.
 */
static int opcion;

/**
 * Objeto Scanner para leer la entrada estándar.
 */
static Scanner kb = new Scanner(System.in);

/**
 * Método para calcular el volumen de un prisma rectangular.
 * Se pide al usuario la longitud, anchura y altura del prisma.
 * El resultado se muestra por pantalla con dos decimales.
 */
public static void prismaRectangular() {

	System.out.println("Por favor, introduzca la longitud del prisma.");
	l = kb.nextDouble();
	System.out.println("Por favor, introduzca la anchura del prisma.");
	w = kb.nextDouble();
	System.out.println("Por favor, introduzca la altura del prisma.");
	h = kb.nextDouble();

	V = w * l * h;
	V = V * 100;
	V = Math.round(V);
	V = V / 100;

	System.out.println("El volumen del prisma es: " + V);
}

/**
 * Método para calcular el volumen de una esfera.
 * Se pide al usuario el radio de la esfera.
 * El resultado se muestra por pantalla con dos decimales.
 */
public static void esfera() {

	System.out.println("Por favor, introduzca el radio de la esfera.");
	r = kb.nextDouble();

	d = r * 2;
	V = (Math.PI * Math.pow(d, 3)) / 6;
	V = V * 100;
	V = Math.round(V);
	V = V / 100;

	System.out.println("El volumen de la esfera es: " + V);
}

/**
 * Método para calcular el volumen de un cubo.
 * Se pide al usuario la longitud de cada lado del cubo.
 * El resultado se muestra por pantalla con dos decimales.
 */
public static void cubo() {

	System.out.println("Por favor, introduce la longitud de cada lado.");
	l = kb.nextDouble();
	V = Math.pow(l, 3);
	V = V * 100;
	V = Math.round(V);
	V = V / 100;

	System.out.println("El volumen del cubo es " + V);
}

/**
 * Método principal para interactuar con el usuario.
 * Se muestra un menú para elegir qué tipo de objeto se desea calcular su volumen.
 * Se llama al método correspondiente según la opción elegida.