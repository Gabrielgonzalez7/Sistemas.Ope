/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 *
 * @author laboratorio
 */
public class Buffer {
    private BlockingQueue<Integer> fila = new ArrayBlockingQueue<>(5);
    
    public void produzir (int valor) throws InterruptedException{
        fila.put(valor);
        System.out.println("Produzido: " +valor);
    }
    public void consumir() throws InterruptedException{
        int valor = fila.take();
        System.out.println("Consumido: " + valor);
    }
      
}
