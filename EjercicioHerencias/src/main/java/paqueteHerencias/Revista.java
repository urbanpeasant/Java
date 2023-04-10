package paqueteHerencias;

public class Revista extends Publicacion {
    private int identificador;
    private boolean prestado;
    
    public Revista(int codigo, String titulo, int anioPublicacion) {
        super();
        prestado = false;
    }
    
    public int getIdentificador() {
        return identificador;
    }
    
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
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
        return super.toString() + ", Identificador: " + identificador + ", Prestado: " + prestado;
    }
}
