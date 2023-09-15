package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class TrafficLightSimulator {
    protected List<iTrafficCirculators>_circulators=new ArrayList<>();

    public void addCirculators(iTrafficCirculators circulator){
        _circulators.add(circulator);
    }
    public void removeCirculators(iTrafficCirculators circulator){
        _circulators.remove(circulator);
    }

    public void notifyCirculators(){
        for(var circulator:_circulators){
            circulator.update();
        }
    }

}
