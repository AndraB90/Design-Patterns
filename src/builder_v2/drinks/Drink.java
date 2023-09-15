package builder_v2.drinks;

import builder_v2.packages.Bottle;
import builder_v2.packages.Package;
import builder_v2.Product;

public abstract class Drink implements Product {
    @Override
    public Package getPackage() {
        return new Bottle();
    }
}
