package ejercicioGestionExcepciones;

import java.util.Scanner;

public class LeerPorTeclado {
    private char caracterLeido;
    
    public char getChar() throws ExcepcionVocal, ExcepcionNumero, ExcepcionBlanco, ExcepcionSalida {
        Scanner sc = new Scanner(System.in);
        this.caracterLeido = sc.next().charAt(0);
        
        // Procesamiento de excepción según el caracter leido:
        
        if (esVocal(this.caracterLeido)) {
            throw new ExcepcionVocal("Se ha leido una vocal");
        } else if (esNumero(this.caracterLeido)) {
            throw new ExcepcionNumero("Se ha leido un número");
        } else if (esBlanco(this.caracterLeido)) {
            throw new ExcepcionBlanco("Se ha leido un espacio en blanco");
        } else if (esSalida(this.caracterLeido)) {
            throw new ExcepcionSalida("Se ha leido el caracter de salida");
        }
        
        return this.caracterLeido;
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