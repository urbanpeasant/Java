package multihilos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Lanzabolas implements Runnable{
	
	private String nombre;
	
	public Lanzabolas(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public void run() {
		LocalDateTime ahora = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
		
		System.out.printf("Lanzando una bola desde %s a las %s\n", nombre, ahora.format(formatter));
		
	}
	
}
