package paquetelibros;

public class Revista extends Publicacion {

	// Propiedades
	
	private int pagInicial;
	
	// Propiedades estáticas

	


	private static String mensajeCabecera = "\nDATOS REVISTA\n===========\n";
	

	// Constructores
	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, formatoDigital, precio);
		this.pagInicial = pagInicial;

	}

	// Métopdos

	// Getters

	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	public int getPagInicial() {
		return pagInicial;
	}
	//Show de revistarevista
	
	@Override
	public void show() {
		System.out.println(Revista.getMensajeCabecera() + "Título: " + getTitulo() + "Id: " + getID() + "Páginas: "
				+ getNumPags() + "Página Actual: " + getPagActual() + "Precio: " + getPrecio() + " €"
				+ "Formato digital: " + isFormatoDigital() + "Leído: " + isLeido());
	}
	
	//silenciosamente revista
	
	@Override
	public void leePagina(boolean silenciosamente) {
	    super.leePagina(silenciosamente);
	    
	}


}
