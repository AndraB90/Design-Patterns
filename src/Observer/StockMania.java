package Observer;

public class StockMania {
    public static void main(String[] args) {
        ProductPublisher publisher=new ProductPublisher();
        StocksObserver observer=new StocksObserver(publisher);
        StocksObserver observer2=new StocksObserver(publisher);
        StocksObserver observer3=new StocksObserver(publisher);

        publisher.set_lastPrice(456);


    }
}
