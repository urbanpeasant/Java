package ejemplos;

public class FactorialFor {
	 public static void main (String [] args){
	      for (int n = 1; n <=10; n++) {
	              int f = 1;
	           for (int i = 2; i<=n; i++) {
	               f *= i; // equivalente a f = f * i
	        }
	        System.out.print("El factorial de " + n);
	        System.out.println(" es: " + f);
	       }
	  }
	}