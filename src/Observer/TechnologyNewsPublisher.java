package Observer;

public class TechnologyNewsPublisher extends NewsPublisher{
    private int _rtxPrice;

    public void setLastRtxPrice(int price){
        _rtxPrice=price;
        this.notifySubscribers();
    }

    public int getLastRtxPrice(){
        return _rtxPrice;
    }

}
