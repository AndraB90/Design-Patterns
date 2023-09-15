package adapter_v2;

public class Main {
    public static void main(String[] args) {
        Knight knight = new Knight();
        Wizzard wizzard = new Wizzard();

        knight.attack();
        knight.defend();
        knight.escape();

        WizzardAdaptor wizzardAdaptor = new WizzardAdaptor(wizzard);
        wizzardAdaptor.attack();
        wizzardAdaptor.defend();
        wizzardAdaptor.escape();
    }
}
