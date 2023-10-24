package _collections;

import java.util.Objects;

public class Coche {
    private Marca marca;
    private Color color;

    public Coche(Marca marca, Color color) {
        this.marca = marca;
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return marca.getNombreCompleto() + " " + color.getNombreCompleto();
    }

    @Override
    public boolean equals(Object o) {
//    	Coche esteCoche = (Coche) o;
//    	boolean esIgual = esteCoche.getClass()== this.getClass()&& this.getColor().equals(esteCoche.getColor()) && this.getMarca().equals(esteCoche.getMarca());
//    	System.out.println(esIgual);
//    	return esIgual;
    	
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coche coche = (Coche) o;
        return marca == coche.marca && color == coche.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, color);
    }
}
