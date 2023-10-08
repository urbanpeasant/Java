package condicionales;

public class Condicionales {
	
	//Variables
	private int a = 14;
	
	//Constructor
	//Este constructor nos permite asignar un valor nuevo a la variable a pa probar distintos números y que salgan pares e impares.
	 public Condicionales(int a) {
	        this.a = a;
	    }
	//Método para verificarr.
	 
	 //Explicación: Este método nos devuelve un condicional con operador terciario. Estamos diciendo 
	 // que compruebe si el resto de a/2 es cero. Si es así, devuelve par, de lo contrario devuelve es impar
	 //(lo que está a la derecha del paréntesis
	
	public String verificador() {
		return (a % 2 == 0) ? "es par" : "es impar";
	}
	
	
	
	
    public static void main(String[] args) {
    	
    	Condicionales c1 = new Condicionales(13);
    	Condicionales c2 = new Condicionales (14);
    	Condicionales c3 = new Condicionales (15);
    	Condicionales c4 = new Condicionales (16);
    	Condicionales c5 = new Condicionales (17);
    	Condicionales c6 = new Condicionales (18);
    	Condicionales c7 = new Condicionales (19);
    	Condicionales c8 = new Condicionales (20);
    	Condicionales c9 = new Condicionales (21);
    	Condicionales c10 = new Condicionales (22);
    	Condicionales c11 = new Condicionales (23);
    	Condicionales c12 = new Condicionales (24);
    	Condicionales c13 = new Condicionales (25);
    	Condicionales c14 = new Condicionales (26);
    	Condicionales c15 = new Condicionales (27);
    	
    	
       System.out.println("1 es " + c1.verificador());
       System.out.println(c2.verificador());
       System.out.println(c3.verificador());
       System.out.println(c4.verificador());
       System.out.println(c5.verificador());
       System.out.println(c6.verificador());
       System.out.println(c7.verificador());
       System.out.println(c8.verificador());
       System.out.println(c9.verificador());
       System.out.println(c10.verificador());
       System.out.println(c11.verificador());
       System.out.println(c12.verificador());
       System.out.println(c13.verificador());
       System.out.println(c14.verificador());
       System.out.println(c15.verificador());
    }
}
