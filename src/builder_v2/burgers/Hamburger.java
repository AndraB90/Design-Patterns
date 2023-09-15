package builder_v2.burgers;

import builder_v2.burgers.Burger;

public class Hamburger extends Burger {
    @Override
    public String getName() {
        return "Hamburger";
    }

    @Override
    public int getPrice() {
        return 15;
    }


}
