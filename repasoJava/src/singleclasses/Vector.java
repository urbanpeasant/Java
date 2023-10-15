package singleclasses;

public class Vector {

	//Propiedades
	
	int x;
	int y;
	
	//Constructores
	
	//Constructor vacío
	/*
	 * public Vector() {
	}
	
	*/
	
	//Constructor dado x e y
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//Constructor dado un valor utilizado para X e Y
	
	public Vector(int valor) {
		this.x = this.y = valor;
	}
	
	//Constructor copia
	public Vector (Vector v) {
		this.x = v.x;
		this.y = v.y;
	}
	
	//Métodos
	
	//Método show:
	
	public void show() {
		System.out.printf("Vector de coordenadas (%d, %d)%n", this.x, this.y);
	}
	
	public Vector suma(Vector v) {
		Vector suma = new Vector(this.x +v.x, this.y +v.y);
		return suma;
	}
	
}
