package proyectoPrueba;

import java.util.Random;


public class ClasePersona {
	
	//Constantes de la clase
    private final static char[] LETRAS_DNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    public final static char SEXO_POR_DEFECTO = 'H';
    public final static int PESO_BAJO = -1;
    public final static int PESO_IDEAL = 0;
    public final static int SOBREPESO = 1;
    
    //Atributos de la clase
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;
    
    
    //Constructor básico
    
    public ClasePersona() {
        this("", 0, SEXO_POR_DEFECTO);
    }

    //Constructor con nombre edad y sexo, el resto por defecto
    
    public ClasePersona(String nombre, int edad, char sexo) {
        this(nombre, edad, "", sexo, 0, 0);
    }

    //Constructor con todos los parámetros
    
    public ClasePersona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
        if (this.DNI.equals("")) {
            generarDNI();
        }
    }

    public int calcularIMC() {
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PESO_BAJO;
        } else if (imc >= 20 && imc <= 25) {
            return PESO_IDEAL;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        return (edad >= 18);
    }

    private char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            return sexo;
        } else {
            return SEXO_POR_DEFECTO;
        }
    }

    private void generarDNI() {
        Random random = new Random();
        int numDNI = random.nextInt(100000000);
        char letraDNI = LETRAS_DNI[numDNI % 23];
        DNI = String.format("%08d", numDNI) + letraDNI;
    }

    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nDNI: " + DNI +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public static void main(String[] args) {
        // Objeto 1 con constructor por defecto
        ClasePersona persona1 = new ClasePersona();

        // Objeto 2 con constructor con nombre, edad y sexo.
        ClasePersona persona2 = new ClasePersona("Lola", 33, 'M');

     // Objeto 3 con con todos los atributos
        ClasePersona persona3 = new ClasePersona("Jose", 31, "25445798X", 'H', 70, 1.78);
        
       

        // Cambiar el peso de persona1
        persona1.setPeso(65);

        // Mostrar si persona2 es mayor de edad
        System.out.println(persona2.esMayorDeEdad());

        // Mostrar el índice de masa corporal de persona3
        int imc = persona3.calcularIMC();
        if (imc == -1) {
            System.out.println("La persona tiene bajo peso.");
        } else if (imc == 0) {
            System.out.println("La persona está en su peso ideal.");
        } else {
            System.out.println("La persona tiene sobrepeso.");
        }

        // Mostrar información de persona3
        System.out.println(persona3.toString());

        // Generar un nuevo DNI para persona2
        persona2.generarDNI();
        System.out.println(persona2.toString());
    }
}
