package excepcionesGenericasYAleatorias;

public class AdultoException extends Exception {

	 String msj;

	public AdultoException(String msj){
		super(msj);
	}
}