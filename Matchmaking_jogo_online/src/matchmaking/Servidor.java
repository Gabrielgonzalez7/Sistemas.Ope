/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchmaking;

/**
 *
 * @author gabri
 */
public class Servidor extends Thread {
    
    @Override
    public void run(){
        while(true){
            try{
                System.out.println(
                        "/n Servidor aguardando jogadores...");
                
                Jogador j1 = Fila.fila.take();
                Jogador j2 = Fila.fila.take();
                
                System.out.println("/n Inicio de partida: ");
                
                System.out.println(
                j1.getNickname()
                + " X "
                + j2.getNickname());
                sleep(3000);
                System.out.println("Fim de partida!! /n");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}
