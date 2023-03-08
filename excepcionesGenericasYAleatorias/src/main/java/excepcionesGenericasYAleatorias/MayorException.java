package excepcionesGenericasYAleatorias;

public class MayorException extends Exception {

	 String msj;

	public MayorException(String msj){
		super(msj);
	}
}