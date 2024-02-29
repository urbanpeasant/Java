package procesosEjercicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LanzaBolas implements Runnable{

	private String nombre;
	
	public LanzaBolas(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public void run() {
		
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss:SSS");
		
		System.out.printf("Lanzando bola desde %s a las %s\n", nombre, ahora.format(formateador));
		
	}
	
//	public static void main(String[] args) {
//		LanzaBolas l1 = new LanzaBolas("L1");
//		l1.run();
//	}
	
	
	
}
