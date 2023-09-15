package Observer;

public class EndLevelPublisher extends GameLevelPublisher {
    private boolean _defeatBoss;

    public boolean isDefeatBoss() {
        return _defeatBoss;
    }

    public void setDefeatBoss(boolean defeatBoss) {
        _defeatBoss = defeatBoss;
        this.notifyPlayers();
    }
}
