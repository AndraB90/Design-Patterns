package TemplateMethod;

public abstract class GameMechanics {

    protected String game_name="";

    public GameMechanics(String game_name) {
        this.game_name = game_name;
    }

    public abstract void playerMovement();
    public abstract void collision();
    public abstract void detection();
    public abstract void scoring();

    public void mechanics(){
        playerMovement();
        collision();
        detection();
        scoring();

    }
}
