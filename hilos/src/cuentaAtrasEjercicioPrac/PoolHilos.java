package cuentaAtrasEjercicioPrac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolHilos {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        CuentaAtrasRunnable cuenta1 = new CuentaAtrasRunnable("C1", 5);
        CuentaAtrasRunnable cuenta2 = new CuentaAtrasRunnable("C2", 10);

        pool.submit(cuenta1);
        pool.submit(cuenta2);

        pool.shutdown();
    }
}
