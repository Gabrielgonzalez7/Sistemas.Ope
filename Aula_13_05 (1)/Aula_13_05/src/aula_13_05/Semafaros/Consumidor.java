/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.Semafaros;

/**
 *
 * @author laboratorio
 */
public class Consumidor implements Runnable {
        private Buffer buffer;
        public Consumidor (Buffer buffer){
            this.buffer = buffer;
        }
    @Override
    public void run() {
        try {
            for(int i = 0; i <10; i++){
                buffer.get();
                Thread.sleep(1000); ///tempo de consumo
            }
        } catch(InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
