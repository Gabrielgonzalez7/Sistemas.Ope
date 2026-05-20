/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.Semafaros;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author laboratorio
 */
public class Buffer {
    private Queue<Integer> queue = new LinkedList<>();
    private static final int CAPACITY =5;
    private Semaphore semFull = new Semaphore(0);
    private Semaphore semEmpty = new Semaphore(CAPACITY);
    
    public void put (int item) throws InterruptedException {
        semEmpty.acquire();
        synchronized (this){
            queue.add(item);
            System.out.println("Produzido: " +item);
        }
        semFull.release();
    }
    
    public int get() throws InterruptedException {
        semFull.acquire();
        int item;
        synchronized (this) {
            item = queue.poll();
            System.out.println("Consumido: " +item);
        }
        semEmpty.release();
        return item;
    }
}
