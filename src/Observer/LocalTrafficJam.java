package Observer;

public class LocalTrafficJam extends TrafficLightSimulator{
    private String _newColor;

    public String get_newColor() {
        return _newColor;
    }

    public void set_newColor(String newColor) {
        _newColor = newColor;
        this.notifyCirculators();
    }
}
