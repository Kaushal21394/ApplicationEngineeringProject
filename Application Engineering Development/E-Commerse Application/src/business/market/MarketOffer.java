/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import business.supplier.Product;

/**
 *
 * @author chava
 */
public class MarketOffer {
    
    private String marketOfferId;
    private double floorRatio;
    private double targetRatio;
    private double ceilingRatio;
    private Market market;
    private Product product;
    private static int mid = 0;
    
    public MarketOffer(){
        mid++;
        marketOfferId= "MOF"+mid;
        market = new Market();
        product = new Product();
    }

    public String getMarketOfferId() {
        return marketOfferId;
    }

    public void setMarketOfferId(String marketOfferId) {
        this.marketOfferId = marketOfferId;
    }

    public double getFloorRatio() {
        return floorRatio;
    }

    public void setFloorRatio(double floorRatio) {
        this.floorRatio = floorRatio;
    }

    public double getTargetRatio() {
        return targetRatio;
    }

    public void setTargetRatio(double targetRatio) {
        this.targetRatio = targetRatio;
    }

    public double getCeilingRatio() {
        return ceilingRatio;
    }

    public void setCeilingRatio(double ceilingRatio) {
        this.ceilingRatio = ceilingRatio;
    }

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
    
    @Override
    public String toString() {
        return marketOfferId;
    }
    
    
    
    
}
