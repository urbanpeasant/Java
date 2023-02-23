package paqueteEjercicios;

public class ConsumoAlex {
	
	private double kms;
	private double litros;
	private double vmed;
	private double pags;

	
public ConsumoAlex(double kms, double litros, double vmed, double pgas) {
	this.kms=kms;
	this.litros=litros;
	this.vmed=vmed;
	this.pags=pgas;
	
}
	
public double getTiempo() {
	return kms/vmed;
}

public double consumoMedio() {
	return (litros * 100)/kms;
}

public double consumoEuros() {
	return consumoMedio()*pags;
}

	

public static void main(String[] args) {
		

	}

}
