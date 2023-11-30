package cuentaAtrasEjercicioPrac;

public class CuentaAtrasThread extends Thread {

    private String nombre;
    private int valorInicial;
    private final static int milis = 300;

    public CuentaAtrasThread(String nombre, int valorInicial) {
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
        CuentaAtrasThread c1 = new CuentaAtrasThread("C1", 10);
        CuentaAtrasThread c2 = new CuentaAtrasThread("C2", 20);

        c1.start();
        c2.start();
    }
}
