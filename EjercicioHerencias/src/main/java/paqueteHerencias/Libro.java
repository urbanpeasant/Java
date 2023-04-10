package paqueteHerencias;

public class Libro extends Publicacion {
    private boolean prestado;
    
    public Libro(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        prestado = false;
    }
    
    public boolean isPrestado() {
        return prestado;
    }
    
    public void prestar() {
        prestado = true;
    }
    
    public void devolver() {
        prestado = false;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}