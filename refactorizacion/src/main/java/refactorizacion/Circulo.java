package refactorizacion;

//NOTA: Aquí he borrado parte del código que estaba por duplicado. Además, a modo de ejemplo, he modificado el método de calcular área. Ahora calcula el área sin pasar el radio como parámetro, usando el propio valor de radio para hacer los cálculos dentro del método.

public class Circulo {
    private double radio;

    // constructor, getters y setters para el atributo radio

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // otros métodos relacionados con los círculos
}

public class Item {
    private String nombre;
    private String descripcion;
    private double precio;

    public Item(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}




