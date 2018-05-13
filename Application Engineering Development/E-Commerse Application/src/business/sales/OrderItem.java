/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.sales;

import business.market.MarketOffer;
import business.supplier.Product;

/**
 *
 * @author chava
 */
public class OrderItem {
    
    private MarketOffer marketOffer;
    private int quantity;
    private int paidPrice;
    
    public OrderItem(){
        
        marketOffer = new MarketOffer();
    }

    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }

  
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPaidPrice() {
        return paidPrice;
    }

    public void setPaidPrice(int paidPrice) {
        this.paidPrice = paidPrice;
    }
    
    public double orderItemTotal(){
        
       double totalPrice = getQuantity()*getPaidPrice();
       return totalPrice;
    }
    
     public double orderItemTargetTotal(){
        
       double targetPrice = getQuantity()*(getMarketOffer().getTargetRatio()) * (getMarketOffer().getProduct().getPrice());
       return targetPrice;
    }
    
    
    @Override
    public String toString() {
        return marketOffer.getProduct().getProdName();
    }    
    
}
