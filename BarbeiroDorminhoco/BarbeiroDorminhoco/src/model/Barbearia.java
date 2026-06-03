package model;

public class Barbearia {
    private final int totalCadeiras;
    private int clientesEsperando = 0;

    public Barbearia(int cadeiras) {
        this.totalCadeiras = cadeiras;
    }

    public synchronized void cortarCabelo() {
        // Barbeiro dorme enquanto não há clientes
        while (clientesEsperando == 0) {
            try {
                System.out.println("[Barbeiro] Sem clientes. Dormindo na cadeira...");
                wait(); // libera o monitor e bloqueia
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        clientesEsperando--;
        System.out.println("[Barbeiro] Cortando cabelo de um cliente. Restam " + clientesEsperando + " na espera.");
        notifyAll();
    }

    //Clientes
    public synchronized void entrarNaBarbearia(int clienteId) {
        System.out.println("[Cliente " + clienteId + "] Entrou na barbearia.");
        // Sem cadeiras livres, cliente vai embora
        if (clientesEsperando >= totalCadeiras) {
            System.out.println("[Cliente " + clienteId + "] Barbearia cheia! Indo embora...");
            return;
        }
        clientesEsperando++;
        System.out.println("[Cliente " + clienteId + "] Sentou-se na cadeira de espera. Total na fila: " + clientesEsperando);
        notifyAll(); // acorda o barbeiro se ele estiver dormindo
        try {
            wait();  // Cliente aguarda até ser atendido
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
