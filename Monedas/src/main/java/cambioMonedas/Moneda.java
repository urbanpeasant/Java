package cambioMonedas;

public class Moneda {
	
	public int cantidad;
	
	public Moneda (int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	//Implementamos el método equals para comparar las monedas. 
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (!(obj instanceof Moneda)) {
			return false;
		} else {
			Moneda miMoneda = (Moneda) obj;
			if (this.cantidad == miMoneda.cantidad) {
				return true;
			}
		}
		return false;
	} 
	

	public int multiplicarPor(int multiplo) {
		return cantidad*multiplo;
	}
	
}
