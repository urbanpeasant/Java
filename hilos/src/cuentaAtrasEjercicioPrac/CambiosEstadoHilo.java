package cuentaAtrasEjercicioPrac;

public class CambiosEstadoHilo {

    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new Thread(() -> {
            // Código del hilo
            for (int i = 0; i < 5; i++) {
                System.out.println("Ejecutando...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        System.out.println("Estado inicial del hilo: " + hilo.getState());

        hilo.start();
        System.out.println("Después de iniciar el hilo: " + hilo.getState());

        while (hilo.isAlive()) {
            System.out.println("Hilo todavía en ejecución...");
            Thread.sleep(500);
        }

        System.out.println("Después de que el hilo ha terminado: " + hilo.getState());
    }
}
