/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor.tarefas;

import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucat
 */
public class DistribuirTarefas implements Runnable {
    
private Socket socket;

    public DistribuirTarefas(Socket socket) {
        this.socket = socket;
    }

   

    @Override
    public void run() {
        try {
        System.out.println("Distribuindo tarefas para " + socket);
        
     Scanner entradaCliente = new Scanner(socket.getInputStream()); 
     
     while(entradaCliente.hasNextLine()) {
         String comando = entradaCliente.nextLine();
         System.out.println(comando);
     }
    
        entradaCliente.close();
    } catch (Exception e) {
        throw new RuntimeException(e);
        
    }
    }
    
}
