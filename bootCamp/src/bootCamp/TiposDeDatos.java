package bootCamp;

public class TiposDeDatos {

	public static void main(String[] args) {
		
		//El esquema para declarar variables es:
		// tipo identificador = valor
		
		
		//enteros
		byte number1=1;//1 byte
		short number2=2;//2 byte
		int number3=3;//4 byte
		long number4=4;//8 byte
		
		//punto flotante
		float decimal1=4.9f; //la f indica que es un float
		double decimal2=9.99d; // Mayor capacidad que float, la D indica que es double.
		
		//caracter
		char caracter1='a'; // Un único caracter
		
		//booleans
		boolean verdadero = true;
		boolean falso = false;
		
		//todos los de arriba son tipos primitivos, por lo que no pueden ser nulos.

		//cadena de texto
		String nombre = "Jose";
		String apellido = "González";
				
		//tipos envoltorio
				
		//Los tipos primitivos no pueden ser NULL, por lo que si declaramos una variable de tipo primitivo como Null, nos dará error. Ej int num1=null. Esto da error. Los tipos envoltorio permiten 'envolver' los tipos primitivos y declararlos null. 
		//Se usan para ellos clases específicas.
		
		Integer numero = null; // puede ser interesante para trabajar con BD. Campos de tipo numérico que el usuario no haya rellenado, por ej. 
		 
		
	}

}
