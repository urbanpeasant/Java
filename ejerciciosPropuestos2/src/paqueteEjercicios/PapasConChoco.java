package paqueteEjercicios;

/**
 * La clase PapasConChoco representa una cantidad de papas y chocos. Es un programa que permite calcular la cantidad de comensales que se pueden atender X de papas y X de chocos, sabiendo de antemano que por cada tres comensales usaremos 1kg de papas y 0.5kg de choco.
 */
public class PapasConChoco {

	
    /**
     * Atributo de la clase. La cantidad de papas.
     */
    private double papas;

    /**
     * Atributo de la clase. La cantidad de chocos.
     */
    private double chocos;

    /**
     * Constructor de la clase:
     * Crea un nuevo objeto PapahConChoco con la cantidad de papas y chocos especificada.
     * @param papas La cantidad de papas.
     * @param chocos La cantidad de chocos.
     */
    public PapasConChoco(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }

    /**
     * Método para calcular los comensales.
     * Devuelve la cantidad de comensales que se pueden atender con la cantidad de papas y chocos actuales.
     * @return La cantidad de comensales que se pueden atender.
     */
    public double getComensales() {
        int comensales = 0;
        while (papas >= 1 && chocos >= 0.5) {
            comensales += 3;
            chocos -= 0.5;
            papas -= 1;
        }
        return comensales;
    }

    /**
     * Métodos extra especificados en el ejercicio:
     * Añade la cantidad especificada de chocos al almacén.
     * @param x La cantidad de chocos a añadir.
     */
    public void addChocos(int x) {
        chocos += x;
    }

    /**
     * Añade la cantidad especificada de papas al almacén.
     * @param x La cantidad de papas a añadir.
     */
    public void addPapas(int x) {
        papas += x;
    }

    /**
     * Muestra la cantidad de chocos que quedan en el almacén.
     */
    public void showChocos() {
        System.out.println("Quedan " + chocos + " kilos de chocos en el almacén.");
    }

    /**
     * Muestra la cantidad de papas que quedan en el almacén.
     */
    public void showPapas() {
        System.out.println("Quedan " + papas + " kilos de papas en el almacén.");
    }

    /**
     * Método main que crea dos objetos PapahConChoco y realiza algunas operaciones con ellos.
     * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        PapasConChoco restaurante = new PapasConChoco(1, 0.5);
        System.out.println("Con esa cantidad de papas y chocos podemos atender a " + restaurante.getComensales() + " comensales.");
        PapasConChoco restaurante2 = new PapasConChoco(50, 25);
        System.out.println("Con esa cantidad de papas y chocos podemos atender a " + restaurante2.getComensales() + " comensales.");

        restaurante.addChocos(10);
        restaurante.addPapas(10);
        restaurante.showChocos();
        restaurante.showPapas();
    }

}
