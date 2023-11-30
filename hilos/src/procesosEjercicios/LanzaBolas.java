package procesosEjercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LanzaBolas implements Runnable{
	
	
	public String nombre;
	
	public LanzaBolas(String nombre) {
		this.nombre=nombre;
	}
	
	

	@Override
	public void run() {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
		
		System.out.printf("Lanzando bola desde %s a las %s\n", nombre, ahora.format(formato));
		
	}

	
//	public static void main(String[] args) {
//		LanzaBolas b1 = new LanzaBolas("Lanzador1");
//		b1.run();
//	}
	
}
