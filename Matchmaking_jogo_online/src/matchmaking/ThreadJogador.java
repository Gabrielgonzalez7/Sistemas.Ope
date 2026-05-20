/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchmaking;

/**
 *
 * @author gabri
 */
public class ThreadJogador extends Thread {
    private Jogador jogador;
    
    public ThreadJogador(Jogador jogador){
        this.jogador = jogador;
    }
    
    @Override
    public void run(){
            try {
                System.out.println(
                        " Jogador " 
                +jogador.getNickname()
                +" tentando entrar na fila...");
                Fila.fila.put(jogador);
                System.out.println(
                        " Jogador " + jogador.getNickname() 
                                + " entrou na fila!!");
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }   
}
