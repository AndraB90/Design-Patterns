package Observer;

import java.util.*;

public abstract class NewsPublisher {
    protected List<iNewsSubscriber>_subscribers=new ArrayList<>();
    public void addSubscriber(iNewsSubscriber subscriber){
        _subscribers.add(subscriber);

    }
    public void removeSubscriber(iNewsSubscriber subscriber){
        _subscribers.remove(subscriber);

    }

    public void notifySubscribers(){
        for (var subscriber:_subscribers) {
            subscriber.update();
        }
    }

}
