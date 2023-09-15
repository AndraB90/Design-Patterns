package builder_v2;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    List<Product> happyMeal;

    public Meal() {
        this.happyMeal = new ArrayList<>();
    }

    public void addProducts(Product product){
        happyMeal.add(product);
    }

    public int getMealCost(){
        int total = 0;
        for (var product:happyMeal) {
            total+= product.getPrice();
        }
        return total;
    }

    public void showMealCost(){
        System.out.println("The total price is: "+getMealCost());
    }

    public void showMealProducts(){
        for (var product: happyMeal) {
            System.out.println("Product: "+product.getName());
            System.out.println("Price: "+product.getPrice());
            System.out.println("Package: "+product.getPackage().pack());
        }
    }
}
