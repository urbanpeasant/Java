package procesosEjercicios;

public class CuentaAtrasRun implements Runnable{
	
	
	private int inicio;
	private String nombre;
	private static final int milis = 300;
	
	
	public CuentaAtrasRun(String nombre, int inicio) {
		this.nombre = nombre;
		this.inicio = inicio;
		
	}
	
	
	private void arranca() {
		for(int i = inicio; i>=0; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			try {
				Thread.sleep(milis);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		CuentaAtrasRun c1 = new CuentaAtrasRun("c1", 10);
		CuentaAtrasRun c2 = new CuentaAtrasRun("c2", 10);
		
		new Thread(c1).start();
		new Thread(c2).start();
		
	}
	

	@Override
	public void run() {
		arranca();
		
	}

}
