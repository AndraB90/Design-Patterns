package Observer;

public class SportNewsPublisher extends NewsPublisher {
    private String _lastSportInfo;

    public void setLastSportInfo(String info){
        _lastSportInfo=info;
        this.notifySubscribers();
    }

    public String getLastSportInfo(){
        return _lastSportInfo;
    }
}
