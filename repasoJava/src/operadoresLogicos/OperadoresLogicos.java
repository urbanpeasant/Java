package operadoresLogicos;

public class OperadoresLogicos {
	
	
	// Si W, X, Y y Z son variables de tipo boolean con valores W = false, X = true, Y = true, Z = false, 
	//determina el valor de las siguientes expresiones lógicas:
	
	/* 
a) W || Y && X && W || Z
b) X && !Y && !X || !W && Y
c) !(W || !Y) && X || Z
d) X && Y && W || Z || X
e) Y || !(Y || Z && W)
f) !X && Y && (!Z || !X) */
	
	//Variables
	
	static boolean W = false;
	static boolean X = true;
	static boolean Y = true;
	static boolean Z = false;
	
	
	public static void main(String[] args) {
		
		boolean a = W || Y && X && W || Z;
        boolean b = X && !Y && !X || !W && Y;
        boolean c = !(W || !Y) && X || Z;
        boolean d = X && Y && W || Z || X;
        boolean e = Y || !(Y || Z && W);
        boolean f = !X && Y && (!Z || !X);
	}
	
	

}
