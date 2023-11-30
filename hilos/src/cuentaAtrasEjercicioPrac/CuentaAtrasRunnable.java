package cuentaAtrasEjercicioPrac;

public class CuentaAtrasRunnable implements Runnable {

    private String nombre;
    private int valorInicial;
    private final static int milis = 300;

    public CuentaAtrasRunnable(String nombre, int valorInicial) {
        this.nombre = nombre;
        this.valorInicial = valorInicial;
    }

    @Override
    public void run() {
        for (int i = valorInicial; i >= 0; i--) {
            System.out.printf("%s: %d%n", nombre, i);
            try {
                Thread.sleep(milis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CuentaAtrasRunnable cuenta1 = new CuentaAtrasRunnable("C1", 10);
        CuentaAtrasRunnable cuenta2 = new CuentaAtrasRunnable("C2", 20);

        Thread hilo1 = new Thread(cuenta1);
        Thread hilo2 = new Thread(cuenta2);

        hilo1.start();
        hilo2.start();
    }
}
