/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.BlockingQueue;

/**
 *
 * @author laboratorio
 */
public class Consumidor implements Runnable {
    private Buffer buffer;
    
    public Consumidor(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        try{
            for(int i =0; i <10; i++){
                buffer.consumir();
                Thread.sleep(1000); //temopo de consumo
            }
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }    
}
