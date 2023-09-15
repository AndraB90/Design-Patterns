package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class GameLevelPublisher {
    protected List<iGamePlayers>_players=new ArrayList<>();

    public void addPlayer(iGamePlayers player){
        _players.add(player);
    }

    public void removePlayer(iGamePlayers player){
        _players.remove(player);
    }

    public void notifyPlayers(){
        for(var player:_players){
            player.update();
        }
    }
}
