package Observer;

public class TechnologyNewsSubscribers implements iNewsSubscriber{

    private TechnologyNewsPublisher _publisher;

    public TechnologyNewsSubscribers(TechnologyNewsPublisher publisher){
        _publisher=publisher;
        _publisher.addSubscriber(this);
    }
    @Override
    public void update() {
        int lastPrice=_publisher.getLastRtxPrice();
        System.out.println("Tech Subscriber updated last price: "+lastPrice);

    }
}
