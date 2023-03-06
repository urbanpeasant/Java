package ejercicioGestionExcepciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class LeerPorTecladoTest {

    @Test
    public void testLeerCaracteres() {
        String input = "a\n3\n \nx\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                char c = sc.next().charAt(0);

                if (esVocal(c)) {
                    System.out.println("Se ha leido una vocal");
                } else if (esNumero(c)) {
                    System.out.println("Se ha leido un número");
                } else if (esBlanco(c)) {
                    System.out.println("Se ha leido un espacio en blanco");
                } else if (esSalida(c)) {
                    System.out.println("Se ha leido el caracter de salida");
                    break;
                }
            }
        } catch (Exception e) {
            Assertions.fail("No se esperaba excepción: " + e);
        }
    }

    private boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    private boolean esNumero(char c) {
        return Character.isDigit(c);
    }

    private boolean esBlanco(char c) {
        return Character.isWhitespace(c);
    }

    private boolean esSalida(char c) {
        return c == 'x';
    }

}