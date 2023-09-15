package builder_v2.burgers;

public class Cheeseburger extends Burger {
    @Override
    public String getName() {
        return "Cheeseburger";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
