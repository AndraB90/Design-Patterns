package TemplateMethod;

public class MainPuzzle {
    public static void main(String[] args) {
        GameMechanics gm=new Platformers("Tomb Raider");
        gm.mechanics();

        GameMechanics gm2=new Shooters("Raymon");
        gm2.mechanics();

        GameMechanics gm3=new PuzzleGames("My Puzzle");
        gm3.mechanics();
    }
}
