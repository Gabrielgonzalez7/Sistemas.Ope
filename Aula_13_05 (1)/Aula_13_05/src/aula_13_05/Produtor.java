/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula_13_05;

/**
 *
 * @author laboratorio
 */
 class Produtor implements Runnable {
    private BufferCircular buffer;
    
    public Produtor(BufferCircular buffer){
        this.buffer = buffer;
    }
    public void run(){
     try{
            for(int i=0; i<10; i++){
                buffer.put(i);
                System.out.println("Produzido: " + i);
            }
            }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    }
        }
    }

