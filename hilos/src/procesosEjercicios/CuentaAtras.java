package procesosEjercicios;

public class CuentaAtras {
	
	private String nombre;
	private int valorInicial;
	private final static int milis = 300;
	
	
	public CuentaAtras(String nombre, int valorInicial) {
		this.nombre = nombre;
		this.valorInicial = valorInicial;
	}

	
	public void arranca() {
		for (int i = valorInicial; i>=0; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			try {
				Thread.sleep(milis);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		CuentaAtras c1 = new CuentaAtras("C1", 10);
		CuentaAtras c2 = new CuentaAtras("C2", 20);
		
		c1.arranca();
		c2.arranca();
	}
	
}
