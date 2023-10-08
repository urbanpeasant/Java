package refactorizacion;

import java.util.List;

public class Factura {
    private List<Item> items;
    private double impuestos;

    // NOTA: Aquí lo que he hecho ha sido separar en varios métodos para calcular los subtatales, los impuestos y el total de manera separada y que no esté todo el mismo bloque de código. Hay más líneas, pero se lee mejor creo yo.

    public double calcularTotal() {
        double subtotal = calcularSubtotal();
        double impuestos = calcularImpuestos(subtotal);
        double total = calcularTotal(subtotal, impuestos);

        mostrarInformacionFactura(subtotal, impuestos, total);

        return total;
    }

    private double calcularSubtotal() {
        double subtotal = 0;

        for (Item item : items) {
            subtotal += item.getPrecio();
        }

        return subtotal;
    }

    private double calcularImpuestos(double subtotal) {
        return subtotal * 0.1;
    }

    private double calcularTotal(double subtotal, double impuestos) {
        return subtotal + impuestos;
    }

    private void mostrarInformacionFactura(double subtotal, double impuestos, double total) {
        System.out.println("Subtotal: " + subtotal);
        System.out.println("Impuestos: " + impuestos);
        System.out.println("Total: " + total);
    }

    // otros métodos relacionados con las facturas
}
