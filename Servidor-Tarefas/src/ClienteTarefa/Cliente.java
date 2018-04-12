/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClienteTarefa;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author lucat
 */
public class Cliente {
    public static void main(String[] args) throws Exception {
        
        
        Socket socket = new Socket("localhost", 12345);
        
        System.out.println("conexao estabelecida");
        
        
        PrintStream saida = new PrintStream(socket.getOutputStream());
        saida.println("Comando1");
        
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();
        saida.close();
        teclado.close();
        
        
        
        socket.close();
    }
    
}
