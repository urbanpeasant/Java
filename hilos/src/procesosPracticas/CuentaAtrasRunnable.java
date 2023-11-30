package procesosPracticas;

public class CuentaAtrasRunnable implements Runnable {
	
	private int inicioContador;
	private String nombreContador;
	private static int numArranca;
	private int ejecucionesInstancia=0;
	private final static int milis = 1;



	private CuentaAtrasRunnable(int inicioContador, String nombreContador) {
		this.inicioContador = inicioContador;
		this.nombreContador = nombreContador;
	}
	

	private void arranca() {
		for(int i=inicioContador; i>=0; i--) {
			System.out.printf("Contador %s: %s restantes%n",nombreContador, (i));
			try {
				Thread.sleep(milis);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		numArranca++;
		ejecucionesInstancia++;
	}
	
	@Override
	public void run() {
		arranca();

	}

	public static void main(String[] args) {
		
		CuentaAtrasRunnable a = new CuentaAtrasRunnable(4, "Contador 1");
		
		int veces = 100_000;
		for (int i = 0; i < veces; i++) {
		new Thread(a).start();
		}
		
		try {
			Thread.sleep(milis * veces / 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.printf("Ejecuciones: %d%n", numArranca);
		System.out.printf("Ejecuciones instancia: %d%n", a.ejecucionesInstancia);

	}
}
