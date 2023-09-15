package Observer;

public class EndLevelGamePlayers implements iGamePlayers{
    private EndLevelPublisher _endLevelPublisher;

    public EndLevelGamePlayers(EndLevelPublisher endLevelPublisher){
        _endLevelPublisher=endLevelPublisher;
        _endLevelPublisher.addPlayer(this);
    }

    @Override
    public void update(){
        boolean info=_endLevelPublisher.isDefeatBoss();
        System.out.println("Game Over! Boss has been defeated. Congrats: "+info);
    }
}
