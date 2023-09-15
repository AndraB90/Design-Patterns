package Observer;

public class LocalWeatherObserver implements WeatherObservers{
    private LocalWeatherPublisher _publisher;

    public LocalWeatherObserver(LocalWeatherPublisher publisher){
        _publisher=publisher;
        _publisher.addObserver(this);
    }

    @Override
    public void update(){
        int temperature= _publisher.getTemperature();
        int humidity= _publisher.getHumidity();
        System.out.println("Local Weather Observer updated temperature change "+temperature+" and the humidity of "+humidity);
    }
}
