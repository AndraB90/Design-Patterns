package Observer;

public class LocalCirculators implements iTrafficCirculators{

    private LocalTrafficJam _localTrafficJam;

    public LocalCirculators(LocalTrafficJam localTrafficJam){
        _localTrafficJam=localTrafficJam;
        _localTrafficJam.addCirculators(this);
    }

    @Override
    public void update(){
        String color=_localTrafficJam.get_newColor();
        System.out.println("Circulators are shown the current traffic light state : "+color);
    }
}
