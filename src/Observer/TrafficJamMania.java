package Observer;

public class TrafficJamMania {
    public static void main(String[] args) {
        LocalTrafficJam localTrafficJam=new LocalTrafficJam();
        LocalCirculators localCirculator1=new LocalCirculators(localTrafficJam);
        LocalCirculators localCirculator2=new LocalCirculators(localTrafficJam);
        LocalCirculators localCirculator3=new LocalCirculators(localTrafficJam);

        localTrafficJam.set_newColor("Green");
    }
}
