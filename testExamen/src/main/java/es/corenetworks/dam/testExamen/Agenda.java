package es.corenetworks.dam.testExamen;

import es.corenetworks.dam.testExamen.utilidades.Constantes;
import es.corenetworks.dam.testExamen.utilidades.NumeroNoValidoException;
import es.corenetworks.dam.testExamen.utilidades.NumeroNotFoundException;
import es.corenetworks.dam.testExamen.utilidades.PosicionNoValidaException;
import es.corenetworks.dam.testExamen.utilidades.PosicionVaciaException;
import es.corenetworks.dam.testExamen.utilidades.Utilidades;

public class Agenda {
	
	//atributos de la clase.
	private int [] agenda; //array de enteros
	public int elementos; // contador para los elementos de la agenda
	
	
	//Constructor sin parámetros que da como tamaño al array el dado por la constante previamente creada.
	public Agenda() {
		
		agenda = new int [Constantes.TAMAÑO_AGENDA];
	}
	
	//Constructor con el parámetro tamaño agenda
	
	public Agenda (int tamanyo) {
		this.agenda = new int [tamanyo];
	}
	
	//Método para obtener el tamaño de la agenda
	
	public int getTamanyoAgenda() {
		return elementos;
	}
	
	//Método para comprobar el teléfono. Si no es válido lanza una excepción.
	
	private void compruebaTelf(int numTelf) throws NumeroNoValidoException{
		if(Utilidades.getLongitudNumero(numTelf)!=8)
			throw new NumeroNoValidoException(Constantes.NUMERO_NO_VALIDO_EXCEPTION);
	}
	
	//Método para añadir el telf. Usa el método compruebaTelf para ver si es válido. Si es válido, añade el num. Si no, lanza excepción.
	public void añadirNumero(int numTelf) throws NumeroNoValidoException{
		compruebaTelf(numTelf);
		boolean agregado = false;
		for (int i =0; i<agenda.length; i++) {
			if (agenda[i] == 0) {
				agenda [i]=numTelf;
				agregado = true;
				elementos ++;
				break;
			}
		}
		
		if (agregado == false) {
			System.out.println("Agenda llena");
		}
	}
	
	//Método para buscar num en la agenda. Si no encuentra num lanza excepcion.
	
	public int buscarNumero (int numTelf) throws NumeroNotFoundException {
		for (int i = 0; i<agenda.length;i++) {
			if (agenda[i]==numTelf) {
				return i;
			}
		}
		throw new NumeroNotFoundException(Constantes.NUMERO_NOT_FOUND_EXCEPTION);
	}
	
	//Método para eliminar num de la agenda. Recibe un telf y lo elimina, poniendo un 0 en su posicion. Si el num no es válido lanza la expceion pertinente.Devuelve true si ha borrado y false si no.
	
	public boolean eliminarNumero(int numTelf) throws NumeroNoValidoException{
		compruebaTelf(numTelf);
		int posicion;
		try {
			posicion = buscarNumero(numTelf);
			agenda[posicion]=0;
			System.out.println("numero "+ numTelf + "borrado");
			elementos --;
			return true;
		} catch (NumeroNotFoundException e) {
			return false;
		}
	}
	
	//Método que recibe un int que representa la posicion en el array. Si no es válida o está vacia, lanza excepción.
	
	public int getNumeroEnPosicion(int posicion) throws PosicionNoValidaException, PosicionVaciaException {
		if (posicion > agenda.length -1)
			throw new PosicionNoValidaException(Constantes.POSICION_NO_VALIDA_EXCEPTION);
		if (agenda[posicion] == 0) {
			throw new PosicionVaciaException(Constantes.POSICION_VACIA_EXCEPTION);
		}
		
		return agenda[posicion];
	}

	public boolean estaVacia() {
		for (int i=0; i<agenda.length; i++) {
			if (agenda[i]!=0) {
				return false;
			}
			
			
			}return true;
		}
	}


