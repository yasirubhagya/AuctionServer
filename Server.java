/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yasiru
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Server implements Runnable { 

   
    public static final int BASE_PORT = 1250;  // do not change    

    private ServerSocket serverSocket=null;  // server Socket for main server 
    public StockDb stockDb;

    public Server(int socket,StockDb sdb) {
	this.stockDb =sdb;
	try { 
	    this.serverSocket = new ServerSocket(socket); 
	} catch (IOException e) { 
	    System.out.println(e); 
	}
    }

   
    public void run(){
      server_loop();
    
    }

    public void server_loop() { 
	try { 
	    while(true) { 
		Socket socket = this.serverSocket.accept(); 
		ConnectionServer worker = new ConnectionServer(this); 
		worker.handleConnection(socket); 
	    }
	} catch(IOException e) { 
	    System.out.println(e);
	}
    }// end server_loop 
}


	




