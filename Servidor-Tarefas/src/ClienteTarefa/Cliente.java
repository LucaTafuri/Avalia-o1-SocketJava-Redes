/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteTarefa;

import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author lucat
 */
public class Cliente {
    public static void main(String[] args) throws Exception {
        
        
        Socket socket = new Socket("localhost", 12345);
        System.out.println("conexao estabelecida");
        socket.close();
    }
    
}
