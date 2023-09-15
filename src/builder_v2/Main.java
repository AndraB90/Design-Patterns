package builder_v2;

import builder_v2.burgers.Cheeseburger;
import builder_v2.burgers.Hamburger;
import builder_v2.drinks.Fanta;

public class Main {
    public static void main(String[] args) {
//        Meal meal = new Meal();
//        meal.addProducts(new Hamburger());
//        meal.addProducts(new Cheeseburger());
//        meal.addProducts(new Fanta());


        MealBuilder mealBuilder = new MealBuilder();
        Meal smallMeal = mealBuilder.prepareSmallMenu();
        Meal largeMeal = mealBuilder.prepareLargeMeal();

        smallMeal.showMealCost();
        largeMeal.showMealProducts();
    }
}
