package TemplateMethod;

public class Shooters extends GameMechanics{
    public Shooters(String game_name) {
        super(game_name);
    }

    @Override
    public void playerMovement() {
        System.out.println("Run to catch the enemy...");
    }

    @Override
    public void collision() {
        System.out.println("You have been shot!");
    }

    @Override
    public void detection() {
        System.out.println("Hide well");
    }

    @Override
    public void scoring() {
        System.out.println("You achived the next level");
    }
}
