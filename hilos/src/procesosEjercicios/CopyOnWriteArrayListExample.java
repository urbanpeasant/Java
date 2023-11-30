package procesosEjercicios;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // Hilo para agregar elementos a la lista
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                list.add(i);
                try {
                    Thread.sleep(100); // Simular demora
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Hilo para iterar sobre la lista
        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(50); // Comenzar después de una breve pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int num : list) {
                System.out.println(num);
            }
        });

        thread1.start();
        thread2.start();

    }
}