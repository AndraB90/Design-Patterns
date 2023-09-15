package builder_v2;

import builder_v2.burgers.Cheeseburger;
import builder_v2.burgers.Hamburger;
import builder_v2.drinks.Cola;
import builder_v2.drinks.Fanta;

public class MealBuilder {

    public Meal prepareSmallMenu(){
        Meal meal = new Meal();
        meal.addProducts(new Hamburger());
        meal.addProducts(new Cola());
        return meal;
    }

    public Meal prepareLargeMeal(){
        Meal meal = new Meal();
        meal.addProducts(new Hamburger());
        meal.addProducts(new Cheeseburger());
        meal.addProducts(new Cola());
        meal.addProducts(new Fanta());
        return meal;
    }
}
