package Observer;

public class StocksObserver implements Stocks{

    private ProductPublisher _productPublisher;

    public StocksObserver(ProductPublisher productPublisher) {
        _productPublisher=productPublisher;
        _productPublisher.addPrices(this);
    }

    @Override
    public void update(){
        int price=_productPublisher.get_lastPrice();
        System.out.println("Stocks Observer received updated price "+price);
    }
}
