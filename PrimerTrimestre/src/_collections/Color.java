package _collections;

public enum Color {
    RO("Rojo"),
    NA("Naranja"),
    AM("Amarillo"),
    VE("Verde"),
    AZ("Azul"),
    IN("Índigo"),
    VI("Violeta");

    private String nombreCompleto;

    Color(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}

