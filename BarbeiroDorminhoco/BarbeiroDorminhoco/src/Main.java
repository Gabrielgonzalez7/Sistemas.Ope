import model.Barbearia;
import threads.Barbeiro;
import threads.Cliente;

public class Main {
    public static void main(String[] args) {
        // Barbearia com 3 cadeiras de espera
        Barbearia barbearia = new Barbearia(3);

        // Inicia a thread do barbeiro
        Thread threadBarbeiro = new Thread(new Barbeiro(barbearia));
        threadBarbeiro.start();

        // Gera 10 clientes
        Thread gerador = new Thread(new Runnable() {
            @Override
            public void run() {
                int idCliente = 1;

                while (idCliente <= 10) {
                    Thread threadCliente = new Thread(new Cliente(idCliente, barbearia));
                    threadCliente.start();

                    idCliente++;

                    try {
                        // Intervalo de 1.5 segundos de chegada
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        break;
                    }
                }

                System.out.println("=== Todos os clientes do dia já foram gerados ===");
            }
        });
        gerador.start();
    }
}
