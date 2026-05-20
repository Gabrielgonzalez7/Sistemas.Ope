/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.BlockingQueue;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
       
        Buffer buffer = new Buffer();
        Thread produtor = new Thread(new Produtor(buffer));
        Thread consumidor = new Thread(new Consumidor(buffer));
       
        produtor.start();
        consumidor.start();
        
    }
    
}
