package ejercicioGestionExcepciones;

public class ExcepcionSalida extends Exception {
	
    String msj;
	
    public ExcepcionSalida(String msj) {
        super(msj);
    }
}