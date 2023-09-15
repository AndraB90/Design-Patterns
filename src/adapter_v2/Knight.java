package adapter_v2;

public class Knight implements Warrior {

    @Override
    public void attack() {
        System.out.println("Knight attacks");
    }

    @Override
    public void defend() {
        System.out.println("Knight defends");
    }

    @Override
    public void escape() {
        System.out.println("Knight is running");
    }
}
