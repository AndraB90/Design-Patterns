package TemplateMethod;

public class Platformers extends GameMechanics{

    public Platformers(String game_name) {
        super(game_name);
        System.out.println("Starting Game...");
    }

    @Override
    public void playerMovement() {
        System.out.println("Moving forwards...");
    }

    @Override
    public void collision() {
        System.out.println("Game over...");
    }

    @Override
    public void detection() {
        System.out.println("You are moving into the wrong direction...");
    }

    @Override
    public void scoring() {
        System.out.println("You reached the next level...");
    }
}
