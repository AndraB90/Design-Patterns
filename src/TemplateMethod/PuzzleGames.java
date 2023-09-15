package TemplateMethod;

public class PuzzleGames extends GameMechanics{
    public PuzzleGames(String game_name) {
        super(game_name);
    }

    @Override
    public void playerMovement() {
        System.out.println("It is your turn...");
    }

    @Override
    public void collision() {
        System.out.println("Continue in next session");
    }

    @Override
    public void detection() {
        System.out.println("You found the right piece!");
    }

    @Override
    public void scoring() {
        System.out.println("You reached the next level");
    }
}
