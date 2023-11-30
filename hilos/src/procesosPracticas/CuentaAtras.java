package procesosPracticas;

public class CuentaAtras {
	
	private String nombre;
	private int valorInicial; 

	
	
	public CuentaAtras(String nombre, int valorInicial) {
		this.nombre = nombre;
		this.valorInicial = valorInicial;
	}



	private void arranca() {
		
		for(int i=valorInicial; i>=0; i--) {
			
			System.out.printf("%s: %d%n", nombre,i);
			long tiempoInicial = System.currentTimeMillis();
			long perdidasDeTiempo = 0;
			while(System.currentTimeMillis() - tiempoInicial<1000) {
				perdidasDeTiempo++;
			}
			System.out.println(perdidasDeTiempo);
		}	
	}
	
	public static void main(String[] args) {
		 CuentaAtras cuenta = new CuentaAtras("Perico",34);
		
		cuenta.arranca();
	}
}