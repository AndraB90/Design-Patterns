package Observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class WeatherStationPublisher {
    protected List<WeatherObservers>_observers=new ArrayList<>();

    public void addObserver(WeatherObservers observer){
        _observers.add(observer);
    }

    public void removeOberver(WeatherObservers observer){
        _observers.remove(observer);
    }

    public void notifyObservers(){
        for(var observer:_observers){
            observer.update();
        }
    }

}
