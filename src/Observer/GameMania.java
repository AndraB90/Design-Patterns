package Observer;

public class GameMania {
    public static void main(String[] args) {
        EndLevelPublisher endLevelPublisher=new EndLevelPublisher();
        EndLevelGamePlayers endLevelGamePlayer1=new EndLevelGamePlayers(endLevelPublisher);
        EndLevelGamePlayers endLevelGamePlayer2=new EndLevelGamePlayers(endLevelPublisher);
        EndLevelGamePlayers endLevelGamePlayer3=new EndLevelGamePlayers(endLevelPublisher);

        endLevelPublisher.setDefeatBoss(true);

    }
}
