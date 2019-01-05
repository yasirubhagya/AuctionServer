

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ConnectionServer implements Runnable {

    // per connection variables
    private Socket mySocket; // connection socket per thread 

    private String clientName;
    private String securitySymbol;
    private Server mainServer;

    public ConnectionServer(Server mainServer) {
        this.mySocket = null; // we will set this later 
        this.clientName = null;
        this.mainServer = mainServer;
        // who created me. He should give some interface 
    }

    public boolean handleConnection(Socket socket) {
        this.mySocket = socket;
        Thread newThread = new Thread(this);
        newThread.start();
        return true;
    }

    public void run() { // can not use "throws .." interface is different
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
            out = new PrintWriter(new OutputStreamWriter(mySocket.getOutputStream()));

            String line;
            out.println("Hit Enter to continue");
            out.flush();
            in.readLine();
            out.println("Enter Your Name");
            out.flush();
            
            clientName = in.readLine();
            out.println("Enter Security Symbol");
            out.flush();
            securitySymbol = in.readLine();
            StockItem si = mainServer.stockDb.getItem(securitySymbol);
            if (si == null) {
                out.println(-1);
                out.flush();
            } else {
                out.println("stock price is : " + si.getPrice());
                out.println("place Your Bid : ");
                out.flush();
            }

            for (line = in.readLine(); line != null && !line.equals("quit"); line = in.readLine()) {
                Bid bidItem = new Bid(clientName,Float.parseFloat(line));
                if(mainServer.stockDb.placeBid(securitySymbol, bidItem)){
                out.println("Bid placed successfully"); // Send the said message 
                out.println("new Stock price is "+ mainServer.stockDb.getItem(securitySymbol).getPrice()+ ",Place your next Bid");
                out.flush(); //
                }else{
                     out.println("Your Bid is too low"); 
                     out.println("current Stock price is "+ mainServer.stockDb.getItem(securitySymbol).getPrice()+ ",Place your next Bid");
                     out.flush(); 
                }
              

            }

            // close everything 
            out.close();
            in.close();
            this.mySocket.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
