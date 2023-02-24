package tema3;

public class Exceptions {

	public static void main(String[] args) {
		
		try {
			int a = 4/0;
		} catch(ArithmeticException e) {
			System.out.println("se ha producido una excepción aritmética");
		}catch (Exception e) {
			System.out.println("se ha producido una excepción de otro tipo");
		} finally {
			System.out.println("Bloque finally");
		}

	}

}


