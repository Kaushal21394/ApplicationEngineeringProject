/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.market;

import java.util.ArrayList;

/**
 *
 * @author chava
 */
public class MarketDirectory {
    
    private ArrayList<Market> marketList;
    
    public MarketDirectory(){
        
        marketList= new ArrayList<>();
        
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
    
    public Market addMarket() {
        Market market = new Market();
        marketList.add(market);
        return market;
    }
    
    public void removeMarket(Market market) {
        marketList.remove(market);
    }
    
    public Market searchMarket(String marketName) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Market market : marketList) {
            if(market.getMarketName().equals(marketName)) {
                return market;
            }
        }
        return null;
    }
    
}
