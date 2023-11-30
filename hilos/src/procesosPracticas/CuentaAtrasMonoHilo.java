package procesosPracticas;

public class CuentaAtrasMonoHilo {
	
	private int inicioContador;
	private String nombreContador;
	private static int numArranca;
	private int ejecucionesInstancia=0;
	private final static int milis = 1000;
	
	
	
	public CuentaAtrasMonoHilo(int inicioContador, String nombreContador) {
		this.inicioContador = inicioContador;
		this.nombreContador = nombreContador;
	}



	private void arranca() {
		for(int i=inicioContador; i>=0; i--) {
			System.out.printf("Contador %s: %s restantes%n",nombreContador, (i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		numArranca++;
		ejecucionesInstancia++;
	}

	public static void main(String[] args) {
		
		CuentaAtrasMonoHilo a = new CuentaAtrasMonoHilo(10, "Contador 1");
		
		a.arranca();
		CuentaAtrasMonoHilo a2 = new CuentaAtrasMonoHilo(10, "Contador 2");
		
		a2.arranca();
		
		System.out.printf("Ejecuciones: %d%n", numArranca);
		System.out.printf("Ejecuciones instancia: %d%n", a.ejecucionesInstancia);
	}
}