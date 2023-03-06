package ejercicioGestionExcepciones;

public class ExcepcionNumero extends Exception {
	
    String msj;
	
    public ExcepcionNumero(String msj) {
        super(msj);
    }
}