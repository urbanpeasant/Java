package paquetelibros;

public abstract class Publicacion implements CanRead {

	// Propiedades

	private String titulo;
	private int numPags;
	private boolean formatoDigital;
	private double precio;
	private int ID;
	private int pagActual;
	private boolean leido;

	// Propiedadws estáticas
	private static long nextID = 0;

	// Constructor

	public Publicacion(String titulo, int numPags, boolean formatoDigital, double precio) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.formatoDigital = formatoDigital;
		this.precio = precio;
		this.ID = (int) nextID++;
		this.leido = false;
	}
	
	

	// Método toString

	@Override
	public String toString() {
		return "Publicacion " + this.titulo + " con " + this.numPags + " páginas y precio " + this.precio + " €";
	}

	// Getters

	public String getTitulo() {
		return this.titulo;
	}

	public int getNumPags() {
		return numPags;
	}

	public boolean isFormatoDigital() {
		return formatoDigital;
	}

	public double getPrecio() {
		return precio;
	}

	public int getID() {
		return this.ID;
	}

	public int getPagActual() {
		return pagActual;
	}

	public boolean isLeido() {
		return leido;
	}

	//Setters
	
	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}

	
	
	// Show

	public abstract void show();
	
	//Show estático


	public static void showStatic(Publicacion p) {
		p.show();
	}

	// Método leeSilenciosamente

	public void leePagina(boolean silenciosamente) {
		if (leido) {
			System.out.println("Esta publicación ya ha sido leída.");
			return;
		}

		if (pagActual == numPags) {
			leido = true;
			if (!silenciosamente) {
				if (this instanceof Libro) {
					System.out.printf("Última página (%d) leída del libro titulado %s del autor %s%n", pagActual,
							getTitulo(), ((Libro) this).getAutor());
				} else {
					System.out.printf("Última página (%d) leída de la revista titulada %s%n", pagActual, getTitulo());
				}
			}
		} else {
			pagActual++;
			if (!silenciosamente) {
				if (this instanceof Libro) {
					System.out.printf("Página %d leída del libro titulado %s del autor %s%n", pagActual, getTitulo(),
							((Libro) this).getAutor());
				} else {
					System.out.printf("Página %d leída de la revista titulada %s%n", pagActual, getTitulo());
				}
			}
		}
	}
	
	//Método silencioso estático
	
	public static void leePaginaStatic(Publicacion p, boolean silenciosamente) {
		p.leePagina(silenciosamente);
	}
	
}

