package ejercicioGestionExcepciones;

public class ExcepcionBlanco extends Exception {
	
    String msj;
	
    public ExcepcionBlanco(String msj) {
        super(msj);
    }
}