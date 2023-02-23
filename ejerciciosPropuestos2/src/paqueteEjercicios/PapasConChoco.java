package paqueteEjercicios;

public class PapasConChoco {
	
	
	public static int papas;
	public static int chocos;
	
	public PapasConChoco(){
		papas = 1;
		chocos = 1;
	}
	
	
	public void getComensales() {
		int num1=papas;
		int num2=chocos/2;
		num1*=3;
		num2*=3;
		
		if (num1<num2) {
			System.out.println("Los clientes a los que puede atender el restaurante son: "+num1);
		}else {
			if(num2<num1) {
				System.out.println("Los clientes a los que puede atender el restaurante son: "+num2);
			}
		}
		
	}
	
	public void addChocos(int x) {
		int num1=chocos;
		num1=num1+x;
		chocos=num1;
	}
	
	public void addPapas(int x) {
		int num2=papas;
		num2=num2+x;
		papas=num2;
	}

	public void showChocos() {
		System.out.println("Los kgs de chocos que hay en el almacén son: "+chocos);
	}
	
	public void showPapas() {
		System.out.println("Los kgs de papas que hay en el almacén son: "+papas);
	}
	
	
	
	
	public static void main(String[] args) {
		PapasConChoco pcc=new PapasConChoco();
		pcc.addChocos(chocos);
		pcc.addPapas(papas);
		pcc.getComensales();
		pcc.showChocos();
		pcc.showPapas();

	}

}
