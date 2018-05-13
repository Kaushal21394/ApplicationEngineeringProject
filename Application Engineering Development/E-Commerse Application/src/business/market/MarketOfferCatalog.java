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
public class MarketOfferCatalog {
    
    private ArrayList<MarketOffer> marketOfferList;
    
    public MarketOfferCatalog(){
        
        marketOfferList= new ArrayList<>();
    }

    public ArrayList<MarketOffer> getMarketOfferList() {
        return marketOfferList;
    }

    public void setMarketOfferList(ArrayList<MarketOffer> marketOfferList) {
        this.marketOfferList = marketOfferList;
    }
    
    //Adding new Market Offer
    public MarketOffer addMarketOffer() {
        MarketOffer marketOffer = new MarketOffer();
        marketOfferList.add(marketOffer);
        return marketOffer;
    }
    
    //Removing marketoffer from the list
    public void removeMarketOffer(MarketOffer marketOffer) {
        marketOfferList.remove(marketOffer);
    }
    
    //Searching for market offer based on the name
    public MarketOffer searchMarketOffer(String marketOfferName) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(MarketOffer marketOffer : marketOfferList) {
            if(marketOffer.getMarketOfferId().equals(marketOfferName)) {
                return marketOffer;
            }
        }
        return null;
    }
    
    
}
