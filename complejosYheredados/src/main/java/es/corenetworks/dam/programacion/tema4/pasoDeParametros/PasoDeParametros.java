package es.corenetworks.dam.programacion.tema4.pasoDeParametros;

public class PasoDeParametros {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("a:  " + a);
		a = cambiaValor(a);
		System.out.println("a:  " + a);
		Test t = new Test();
	}

	static void cambiaValor(int a) {
		a = 9;
	}

	static void cambiaReferencia(Test t) {
		t.a = 9;
	}

	class Test {
		int a;
	}
}
