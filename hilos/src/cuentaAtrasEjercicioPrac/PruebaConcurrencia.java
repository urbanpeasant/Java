package cuentaAtrasEjercicioPrac;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PruebaConcurrencia {

    public static void main(String[] args) {
        // Usando CopyOnWriteArrayList
        List<String> listaConcurrente = new CopyOnWriteArrayList<>();

        // Usando ArrayList normal
        // List<String> listaConcurrente = new ArrayList<>();

        Runnable agregarElemento = () -> {
            for (int i = 0; i < 5; i++) {
                listaConcurrente.add(Thread.currentThread().getName() + ": Elemento " + i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread hilo1 = new Thread(agregarElemento);
        Thread hilo2 = new Thread(agregarElemento);

        hilo1.start();
        hilo2.start();

        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tamaño final de la lista: " + listaConcurrente.size());
    }
}
