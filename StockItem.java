/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yasiru
 */
public class StockItem {
    
    private String symbol;
    private String name;
    private float price;
    
    public StockItem(String Symbol,String Name,float Price ){
      this.symbol = Symbol;
      this.name = Name;
      this.price = Price;
    }
    
    public void updatePrice(float newPrice){
     this.price = newPrice;
    }
    
    public String getName(){
     return this.name;
    }
    
    public String getSymbol(){
     return this.symbol;
    }
    
    public float getPrice(){
     return this.price;
    }
    
    
    @Override
    public String toString(){
     return "{ " + this.symbol + " , " + this.name + " , " + this.price + " }\n" ;
    }
}
