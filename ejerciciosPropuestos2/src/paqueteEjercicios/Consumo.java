package paqueteEjercicios;

public class Consumo {
	
	int kms;
	
	float litros;
	
	float vmed;
	
	float pgas;
	

	
Consumo () {
	
	kms = 15420;
	litros = 2245;
	vmed = 120;
	pgas = 2;
	
}


public void setKms() {
	kms = 0;
}

public void setLitros() {
	litros = 0;
}

public void setVmed() {
	vmed = 0;
}

public void setPgas() {
	pgas = 0;
}



public float getTiempo() {
	return vmed*kms;
}

public double consumoMedio() {
	
	return litros/kms * 100;
}


public float consumoEuros() {
	return (litros/kms * 100) * pgas;
	
}


	public static void main(String[] args) {
		Consumo miConsumo = new Consumo();
		System.out.println(miConsumo.getTiempo());
		System.out.println(miConsumo.consumoMedio());
		System.out.println(miConsumo.consumoEuros());
		
		
	}

}
