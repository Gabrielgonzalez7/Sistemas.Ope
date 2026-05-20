/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05.Semafaros;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        Buffer bufferCompartilhado = new Buffer();
        Thread produtorThread = new Thread(new Produtor(bufferCompartilhado));
        Thread consumidorThread =  new Thread(new Consumidor(bufferCompartilhado));
        
        produtorThread.start();
        consumidorThread.start();
        
    }
    
}
