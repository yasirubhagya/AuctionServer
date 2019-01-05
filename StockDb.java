/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yasiru
 */
import java.util.*;
import java.io.*;
import java.net.URL;

public class StockDb {

    private Map<String, StockItem> stockList;
    private Map<String,ArrayList<Bid>> bidList;
    
    
    public StockDb(URL csvFile) {

        bidList = new HashMap<String,ArrayList<Bid>>();
        
        FileReader fileRd = null;
        BufferedReader reader = null;

        try {
            
            fileRd = new FileReader(csvFile.getFile());
            reader = new BufferedReader(fileRd);
            reader.readLine();
            stockList = new HashMap<String, StockItem>();
            String[] tokens;
            for (String line = reader.readLine();
                    line != null;
                    line = reader.readLine()) {
                tokens = line.split(",");
                stockList.put(tokens[0], new StockItem(tokens[0], tokens[1], Float.parseFloat(tokens[2])));
            }
            if (fileRd != null) {
                fileRd.close();
            }
            if (reader != null) {
                reader.close();
            }

        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Malformed CSV file");
            System.out.println(e);
        }

    }

    public void printDb() {
        System.out.println(stockList.toString());

    }

    public StockItem getItem(String key) {
        return stockList.get(key);
    }

    public void updateItem(String key, StockItem item) {
        stockList.put(key, item);
    }
    
    public void updatePrice(String key,float price){
       stockList.get(key).updatePrice(price);
    }
    
    public void addToBidList(String symbol,Bid bidItem){
        if(bidList.containsKey(symbol)){
             bidList.get(symbol).add(bidItem);
        }else{
             ArrayList al = new ArrayList<Bid>();
             al.add(bidItem);
             bidList.put(symbol, al);
        }
    }
    
    public ArrayList<Bid> getBidItemList(String symbol){
      return bidList.get(symbol);
    }
    
    public boolean placeBid(String symbol,Bid bidItem){
       float currentPrice = stockList.get(symbol).getPrice();
       if(bidItem.getPrice() <= currentPrice){
        return false;
       }else{
          stockList.get(symbol).updatePrice(bidItem.getPrice());
          addToBidList(symbol,bidItem);
          return true;
       }
    }
    
    public Object[][] getDataModel() {
    
    Object [][] obj = new Object[stockList.size()][3] ;
    int i=0;
        for (Map.Entry<String, StockItem> entry : stockList.entrySet()) {
            
            StockItem si = entry.getValue();
            
            obj[i][0] = si.getSymbol();
            obj[i][1] = si.getName();
            obj[i][2] = si.getPrice();
            i++;
        }
        return obj;
    }
}
