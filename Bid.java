/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author yasiru
 */

import java.time.LocalDateTime;

public class Bid {
    
    private String biderName;
    private LocalDateTime dtm;
    private float price;
    public Bid(String name,float price){
       this.biderName = name;
       this.price = price;
       this.dtm = LocalDateTime.now();
    }
    
    public String getBidderName(){
    return this.biderName;
    }
    public LocalDateTime getTime(){
    return this.dtm;
    }
    public float getPrice(){
    return this.price;
    }
    
     @Override
    public String toString(){
     return "{ " + this.biderName + " , " + this.dtm.toString() + " , " + this.price + " }\n" ;
    }
}
