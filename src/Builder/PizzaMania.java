package Builder;

public class PizzaMania {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza.PizzaBuilder()
                .size(15)
                .crustType("crusty")
                .sauce("tomato")
                .toppings("Mozarella with Oregano")
                .build();

        pizza1.print();
        System.out.println("===========================");

        Pizza pizza2=new Pizza.PizzaBuilder()
                .size(32)
                .crustType("biscuit")
                .sauce("spicy")
                .toppings("Salami, Peperoni, Ognions")
                .build();

        pizza2.print();
    }
}
