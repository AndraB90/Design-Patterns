package builder_v2.burgers;

import builder_v2.packages.Box;
import builder_v2.packages.Package;
import builder_v2.Product;

public abstract class Burger implements Product {

    @Override
    public Package getPackage() {
        return new Box();
    }
}
