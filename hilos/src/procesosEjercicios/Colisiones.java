package procesosEjercicios;

public class Colisiones implements Runnable {
	private int valorInicial;
	private String nombre;
	private static long ejecuciones = 0;
	private long ejecucionesInstancia;
	private final static int milis = 1;
	
	private Colisiones(int valorInicial, String nombre) {
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}
	
	private void arranca() {
		for(int i = valorInicial; i >= 0 ;i--) {
			System.out.printf("%s: %d%n", nombre, i);
			ejecuciones++;
			ejecucionesInstancia++;
			try {
				Thread.sleep(milis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Colisiones c1 = new Colisiones(4, "C1");
		int veces = 100_000;
		for (int i = 0; i < veces; i++) {
			new Thread(c1).start();
		}

		// Esperamos un tiempo razonable para que terminado
		try {
			Thread.sleep(milis * veces / 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Ejecuciones: %d%n", ejecuciones);
		System.out.printf("Ejecuciones instancia: %d%n", c1.ejecucionesInstancia);
	}

	@Override
	public void run() {
		arranca();	
	}
}