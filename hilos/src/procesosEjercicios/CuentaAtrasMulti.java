package procesosEjercicios;

public class CuentaAtrasMulti extends Thread{
	
	private String nombre;
	private int valorInicial;
	private final static int milis = 300;
	
	
	
	
	public CuentaAtrasMulti(String nombre, int valorInicial) {
		this.nombre = nombre;
		this.valorInicial = valorInicial;
	}

	
	public void arranca() {
		for (int i = valorInicial; i >=0; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			try {
				Thread.sleep(milis);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		CuentaAtrasMulti c1 = new CuentaAtrasMulti("c1", 10);
		CuentaAtrasMulti c2 = new CuentaAtrasMulti("c2", 10);
		
		c1.start();
		c2.start();
	}
	
	@Override
	public void run() {
		arranca();
	}
	
}
