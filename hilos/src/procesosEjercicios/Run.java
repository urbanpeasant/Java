package procesosEjercicios;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run {

	public static void main(String[] args) {

		LanzaBolas l1 = new LanzaBolas("L1");
		LanzaBolas l2 = new LanzaBolas("L2");
		LanzaBolas l3 = new LanzaBolas("L3");

		ExecutorService exe1 = Executors.newFixedThreadPool(3);
		ExecutorService exe2 = Executors.newFixedThreadPool(1);
		ExecutorService exe3 = Executors.newFixedThreadPool(9);

		System.out.println("Pool fijo de 3 con 3 tareas");
		exe1.execute(l1);
		exe1.execute(l2);
		exe1.execute(l3);

		System.out.println("Pool fijo de 1 con 9 tareas");

		for (int i = 0; i < 3; i++) {
			exe2.execute(l1);
			exe2.execute(l2);
			exe2.execute(l3);
		}

		System.out.println("Pool fijo de 9 con 9 tareas");
		for(int i = 0; i<3;i++) {
			exe3.execute(l1);
			exe3.execute(l2);
			exe3.execute(l3);
		}
		
	exe1.shutdown();
	exe2.shutdown();
	exe3.shutdown();
		
	}

}
