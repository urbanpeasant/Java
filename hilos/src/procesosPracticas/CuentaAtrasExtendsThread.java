package procesosPracticas;

public class CuentaAtrasExtendsThread extends Thread{
	
	//propiedades
	
	private int inicioContador;
	private String nombreContador;
	private static int numArranca;
	private int ejecucionesInstancia = 0;
	private final static int milis = 1000;
	
	//Constructor
	
	public CuentaAtrasExtendsThread(int inicioContador, String nombreContador) {
		this.inicioContador=inicioContador;
		this.nombreContador=nombreContador;
	}

	
	public void arranca() {
		for(int i = inicioContador; i>=0; i--) {
			System.out.printf("Contador %s: %s restantes%n", nombreContador,(i));
			try {
				Thread.sleep(milis);
			}catch(InterruptedException e) {
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
		CuentaAtrasExtendsThread cuenta1 = new CuentaAtrasExtendsThread(10, "Contador 1");
		cuenta1.start();
	}
	
}
