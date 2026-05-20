/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args){
        BufferCircular buffer = new BufferCircular(5);
        Thread threadProdutor = new Thread(new Produtor(buffer));
        Thread threadConsumidor = new Thread(new Consumidor(buffer));
        
        threadProdutor.start();
        threadConsumidor.start();
    }
}
