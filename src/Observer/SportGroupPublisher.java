package Observer;

public class SportGroupPublisher extends UserPublisher{
    private String _lastSportInfo;

    public String get_lastSportInfo() {
        return _lastSportInfo;
    }

    public void set_lastSportInfo(String lastSportInfo) {
        _lastSportInfo = lastSportInfo;
        this.notifyChatUsers();
    }
}
