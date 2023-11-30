package cuentaAtrasEjercicioPrac;

public class CuentaAtrasLambdas {

    public static void main(String[] args) {
        Runnable cuentaAtrasC1 = () -> {
            for (int i = 10; i >= 0; i--) {
                System.out.printf("C1: %d%n", i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread hiloC1 = new Thread(cuentaAtrasC1);
        hiloC1.start();
    }
}
