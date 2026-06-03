package threads;

import model.Barbearia;

public class Barbeiro implements Runnable {
    private final Barbearia barbearia;

    public Barbeiro(Barbearia barbearia) {
        this.barbearia = barbearia;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            // Bloqueia se não houver clientes
            barbearia.cortarCabelo();
            try {
                Thread.sleep(2000); //tempo do corte
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
