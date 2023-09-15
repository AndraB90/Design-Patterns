package Observer;

public class WeatherMania {
    public static void main(String[] args) {
        LocalWeatherPublisher localWeatherPublisher=new LocalWeatherPublisher();
        LocalWeatherObserver localWeatherObserver=new LocalWeatherObserver(localWeatherPublisher);
        LocalWeatherObserver localWeatherObserver2=new LocalWeatherObserver(localWeatherPublisher);
        LocalWeatherObserver localWeatherObserver3=new LocalWeatherObserver(localWeatherPublisher);

        localWeatherPublisher.setTemperature(20);
        localWeatherPublisher.setHumidity(15);


    }
}
