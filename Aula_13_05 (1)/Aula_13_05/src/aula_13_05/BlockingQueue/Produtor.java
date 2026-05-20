/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.BlockingQueue;

/**
 *
 * @author laboratorio
 */
public class Produtor implements Runnable {
    private Buffer buffer;
    
    public Produtor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try {
            for(int i=0 ; i <10; i++){
                buffer.produzir(i);
                Thread.sleep(500); //tempo de consumo
            }
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
