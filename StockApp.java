/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yasiru
 */
import java.util.*;

class timerTask extends TimerTask{
    private StockGUI stockGUI;
    private StockDb stockDb;
    timerTask(StockGUI sg,StockDb stdb){
      this.stockGUI =sg;
      this.stockDb =stdb;
    }
    
    public void run(){
        stockGUI.loadTable(stockDb.getDataModel());
    
    }


}

public class StockApp {

    /**
     * @param args the command line arguments
     */
    private static int portNo =2500;
    public static void main(String[] args) {
        Timer timer = new Timer();
        StockDb sdb = new StockDb(StockApp.class.getResource("stocks.csv"));//"F:\\stockMarket\\StockApp\\build\\classes\\stockapp\\stocks.csv");
        
        sdb.printDb();
        StockGUI sg = new StockGUI(sdb);

        timer.scheduleAtFixedRate(new timerTask(sg,sdb),1000,500);

        Thread th = new Thread(new Server(portNo, sdb));
        th.start();

        sg.setVisible(true);
        try {
            th.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(StockApp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
