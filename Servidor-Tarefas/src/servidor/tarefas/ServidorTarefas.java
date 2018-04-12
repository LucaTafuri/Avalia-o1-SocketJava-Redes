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
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        
                
                ServerSocket servidor = new ServerSocket(12345);
                ExecutorService threadPool = Executors.newFixedThreadPool(2); // Método definir um máximo de threads
                
                while(true){
                    Socket socket = servidor.accept();
                    
                    
                    DistribuirTarefas distribuirTarefas = new DistribuirTarefas(socket);
                    threadPool.execute(distribuirTarefas); //Reaproveitamento de threads
                    System.out.println("Aceitando novo cliente" + socket.getPort());              
                    
                }
        // TODO code application logic here
    }
    
}
