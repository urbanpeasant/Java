package multihilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {
	
	
	public static void main(String[] args) {
		
		ExecutorService executor1 = Executors.newFixedThreadPool(3);
		ExecutorService executor2 = Executors.newFixedThreadPool(1);
		ExecutorService executor3 = Executors.newFixedThreadPool(9);
		
		Lanzabolas lanzador1 = new Lanzabolas("Lanzador1");
		Lanzabolas lanzador2 = new Lanzabolas("Lanzador2");
		Lanzabolas lanzador3 = new Lanzabolas("Lanzador3");
		
		
//		executor1.execute(lanzador1);
//		executor1.execute(lanzador2);
//		executor3.execute(lanzador3);
		
		for(int i = 0; i<3; i++) {
			executor2.execute(lanzador1);
			executor2.execute(lanzador2);
			executor2.execute(lanzador3);
		}
		
		
		
//		executor1.shutdown();
		
	}

}
