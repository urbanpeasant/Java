package procesosPracticas;

import java.util.Random;

public class CarreraCoche implements Runnable {

    static int distancia = 10;
    String nombre;
    static String ganador = null;
    int velocidad;
    static boolean carreraTerminada = false; // Nueva variable

    public CarreraCoche(String nombre) {
        this.nombre = nombre;
        velocidad = new Random().nextInt(1001);
    }

    public void arranca() {
        for (int i = distancia; i >= 0; i--) {
            if (carreraTerminada) {
                return; 
            }
            System.out.printf("%s: %d\n", nombre, i);
            if (i == 0) {
                marcarGanador();
                System.out.println("Ha ganado la carrera " + nombre);
            }
            try {
                Thread.sleep(velocidad);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void marcarGanador() {
        synchronized (CarreraCoche.class) {
            if (ganador == null) {
                ganador = nombre;
                carreraTerminada = true; 
            }
        }
    }

    public static void main(String[] args) {
        CarreraCoche cc1 = new CarreraCoche("San Fernando");
        CarreraCoche cc2 = new CarreraCoche("San Miguel");
        new Thread(cc1).start();
        new Thread(cc2).start();
    }

    @Override
    public void run() {
        arranca();
    }
}
