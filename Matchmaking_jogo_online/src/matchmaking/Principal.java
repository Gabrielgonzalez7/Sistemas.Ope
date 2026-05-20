/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchmaking;

/**
 *
 * @author gabri
 */
public class Principal {
    public static void main(String[] args) {
         Servidor servidor = new Servidor();
        servidor.start();

        String nomes[] = {
                " NightWolf",
                " IronMage",
                " Dragon",
                " Shadow",
                " Ghost",
                " Hunter",
                " Storm",
                " Dark"
        };

        for (int i = 0; i < nomes.length; i++) {

            Jogador jogador =
                    new Jogador(i + 1, nomes[i]);

            ThreadJogador t =
                    new ThreadJogador(jogador);

            t.start();

            try {

                Thread.sleep(500);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
