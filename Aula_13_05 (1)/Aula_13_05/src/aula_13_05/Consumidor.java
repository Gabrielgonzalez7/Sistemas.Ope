/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05;

/**
 *
 * @author laboratorio
 */
 class Consumidor implements Runnable {
     private BufferCircular  buffer;
     
     public Consumidor(BufferCircular buffer){
         this.buffer = buffer;
     }

    public void run() {
        try{
            for(int i = 0; i < 10; i++){
                int valor = buffer.get();
                System.out.println("Consumido: " + valor);
            }
        } catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
