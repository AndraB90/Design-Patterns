package Observer;

public class LocalWeatherPublisher extends WeatherStationPublisher{
    private int temperature;
    private int humidity;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int _temperature) {
        temperature = _temperature;
        this.notifyObservers();
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int _humidity) {
        humidity = _humidity;
        this.notifyObservers();
    }
}
