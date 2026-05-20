/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05;

/**
 *
 * @author laboratorio
 */
public class BufferCircular {
    private final int[] buffer;
    private int front = 0;
    private int rear = 0;
    private int count = 0;
    
    public BufferCircular(int size){
        buffer = new int[size];
    }
    public synchronized void put(int value) throws InterruptedException{
        while (count == buffer.length){
            wait();
        }
        buffer[rear] = value;
        rear = (rear +1) % buffer.length;
        count ++;
        notifyAll();
    }
    public synchronized int get() throws InterruptedException{
        while (count ==0){
            wait();
        }
        int result = buffer[front];
        front = (front +1) % buffer.length;
        count--;
        notifyAll();
        return result;
    }
}
