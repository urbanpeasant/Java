package condicionales;


/*
 * NOTA:
 * 
 * El ejercicio pide que se use tanto if como switch.
 * 
 * Mi solución pasa por hacer dos métodos, uno con switch y otro con if, y usando un condicional en el constructor (tenemos que pasar el int del mes y un boolean para determinar qué método usar)
 * usemos uno u otro.
 * 
 * ¿Es correcto o engorroso? Preguntar a Javi las dudas.
 * 
 * 
 * 
 * */

public class EntrenamientoIF {

	/*
	 * 1. Crea un programa que dado el valor de una variable numérica entre 1 y 12
	 * imprima el valor textual del mes con el que se corresponde, en caso de que el
	 * número no sea ninguno de ellos imprimirá no entiendo. 1. Hazlo primero
	 * utilizando sentencias if - else 2. Hazlo a continuación utilizando sentencia
	 * switch
	 * 
	 */

	// Variables

	int numeroMes = 1;
	String nombreMes;

	// Constructor para cambiar el valor de numeroMes!:

	// Como tenemos dos métodos (if y switch) vamos a hacer un condicional en el
	// constructor:

	public EntrenamientoIF(int numeroMes, boolean usarSwitch) {
		this.numeroMes = numeroMes;
		if (usarSwitch) {
			verificaMesSwitch();
		} else {
			verificaMesIf();
		}

	}

	// Método para determinar qué mes es cada número

	public void verificaMesIf() {
		if (numeroMes == 1)
			nombreMes = "Enero";
		else if (numeroMes == 2)
			nombreMes = "Febrero";
		else if (numeroMes == 3)
			nombreMes = "Marzo";
		else if (numeroMes == 4)
			nombreMes = "Abril";
		else if (numeroMes == 5)
			nombreMes = "Mayo";
		else if (numeroMes == 6)
			nombreMes = "Junio";
		else if (numeroMes == 7)
			nombreMes = "Julio";
		else if (numeroMes == 8)
			nombreMes = "Agosto";
		else if (numeroMes == 9)
			nombreMes = "Septiembre";
		else if (numeroMes == 10)
			nombreMes = "Octubre";
		else if (numeroMes == 11)
			nombreMes = "Noviembre";
		else if (numeroMes == 12)
			nombreMes = "Diciembre";
		else
			nombreMes = "No entiendo";
	}

	public void verificaMesSwitch() {
		switch (numeroMes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Septiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;
		default:
			nombreMes = "No entiendo";
			break;
		}
	}

	public static void main(String[] args) {
		EntrenamientoIF m1 = new EntrenamientoIF(6, true);

		System.out.println("El mes número " + m1.numeroMes + " es " + m1.nombreMes);
	}
}
