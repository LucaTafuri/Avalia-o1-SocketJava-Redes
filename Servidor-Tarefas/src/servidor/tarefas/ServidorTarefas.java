/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.tarefas;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



/**
 *
 * @author lucat
 */
public class ServidorTarefas {

    /**
     * 
     * @param args
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        
        ServerSocket servidor = new ServerSocket(8000);
        ExecutorService threadPool = Executors.newFixedThreadPool(4); // Método definir um máximo de threads
        boolean wi = true;
        while(wi)
        {     
            
            Socket socket;
            socket = servidor.accept();
            
            threndTarefas distribuirTarefas = new threndTarefas(socket);
            threadPool.execute(distribuirTarefas);
        }           
        
    }
    
}
