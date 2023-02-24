package paqueteEjercicios;

public class PapahConChoco {
	
	//Atributos de la clase
    private double papas;
    private double chocos;

    
    //Constructor de la clase
    public PapahConChoco(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }
    //Método que nos permite calcular los comensales a atender según la cantidad de papas y chocos.
    public double getComensales() {
		int comensales = 0;
		while (papas >= 1 && chocos >= 0.5) {
			comensales += 3;
			chocos -= 0.5;
			papas -= 1;
		}
		return comensales;
	}

    //Estos son los métodos restantes que pedían en el ejercicio 12, sirven para añadir kilos de comida al almacén y mostrar lo que queda.
    public void addChocos(int x) {
        chocos += x;
    }

    public void addPapas(int x) {
        papas += x;
    }

    public void showChocos() {
        System.out.println("Quedan " + chocos + " kilos de chocos en el almacén.");
    }

    public void showPapas() {
        System.out.println("Quedan " + papas + " kilos de papas en el almacén.");
    }
    
    
    
    public static void main(String[] args) {
        PapahConChoco restaurante = new PapahConChoco(100, 50);
        System.out.println("Con esa cantidad de papas y chocos podemos atender a " + restaurante.getComensales() + " comensales.");
        PapahConChoco restaurante2 = new PapahConChoco(50, 25);
        System.out.println("Con esa cantidad de papas y chocos podemos atender a " + restaurante2.getComensales() + " comensales.");
        
        restaurante.addChocos(10);
        restaurante.addPapas(10);
        restaurante.showChocos();
        restaurante.showPapas();
    }

}
