package threads;

import model.Barbearia;

public class Cliente implements Runnable {
    private final int id;
    private final Barbearia barbearia;

    public Cliente(int id, Barbearia barbearia) {
        this.id = id;
        this.barbearia = barbearia;
    }
    @Override
    public void run() {
        barbearia.entrarNaBarbearia(id);
    }
}
