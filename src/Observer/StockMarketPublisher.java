package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class StockMarketPublisher {
    protected List<Stocks>prices=new ArrayList<>();

    public void addPrices(Stocks stocks){
        prices.add(stocks);
    }

    public void removePrices(Stocks stocks){
        prices.remove(stocks);
    }

    public void notifyPrices(){
        for(var price:prices){
            price.update();
        }
    }
}
