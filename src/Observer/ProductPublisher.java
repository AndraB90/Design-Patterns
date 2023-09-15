package Observer;

public class ProductPublisher extends StockMarketPublisher{
    private int _lastPrice;

    public void set_lastPrice(int lastPrice) {
        _lastPrice = lastPrice;
        this.notifyPrices();
    }

    public int get_lastPrice() {
        return _lastPrice;
    }
}
