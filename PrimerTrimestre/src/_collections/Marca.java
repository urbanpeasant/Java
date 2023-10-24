package _collections;

public enum Marca {
    VW("Volkswagen"),
    TO("Toyota"),
    AU("Audi"),
    ME("Mercedes-Benz"),
    BM("BMW");

    private String nombreCompleto;

    Marca(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
}
