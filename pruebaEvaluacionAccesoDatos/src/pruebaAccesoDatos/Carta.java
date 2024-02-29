package pruebaAccesoDatos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Carta {

    private String valor;
    private String palo;
    private static Random r = new Random();
    private static String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    private static String[] palos = {"Picas", "Corazones", "Treboles", "Diamantes"};

    public Carta(String valor, String palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public static Carta generaCartaAleatoria() {
        List<Carta> listaBaraja = new ArrayList<>();

        for (String palo : palos) {
            for (String valor : valores) {
                listaBaraja.add(new Carta(valor, palo));
            }
        }

        // Añadir comodines
        listaBaraja.add(new Carta("0", "Joker"));
        listaBaraja.add(new Carta("0", "Joker"));

        return listaBaraja.get(r.nextInt(listaBaraja.size()));
    }

    // Getters para obtener el valor y el palo de la carta
    public String getValor() {
        return valor;
    }

    public String getPalo() {
        return palo;
    }
}
