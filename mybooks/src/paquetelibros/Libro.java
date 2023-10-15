package paquetelibros;

public class Libro extends Publicacion {

	// Propiedades
	private String autor;
	private int pagInicial;

	// Propiedades estáticas
	private static String mensajeCabecera = "\nDATOS LIBRO\n===========\n";

	// Constructores
	public Libro(String titulo, String autor, int numPags,  int pagActual, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio);
		this.autor = autor;
		
	}

	// Getters

	public String getAutor() {
		return this.autor;
	}

	public int pagInicial() {
		return this.pagInicial;
	}

	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	
	
	// Show de libro

	@Override
	public void show() {
		System.out.println(Libro.getMensajeCabecera() + "Título: " + getTitulo() + "Autor: " + autor + "Id: " + getID()
				+ "Páginas: " + getNumPags() + "Página inicial: " + pagInicial + "Página Actual: " + getPagActual()
				+ "Precio: " + getPrecio() + " €" + "Formato digital: " + isFormatoDigital() + "Leído: " + isLeido());
	}

	@Override
	public void leePagina(boolean silenciosamente) {
	    super.leePagina(silenciosamente);
	   
	}

	
	

	
}
