package Builder;

public class Pizza {
    private int size;
    private String crustType;
    private String sauce;
    private String toppings;

    public Pizza(int size, String crustType, String sauce, String toppings) {
        this.size = size;
        this.crustType = crustType;
        this.sauce = sauce;
        this.toppings = toppings;
    }

    public int getSize() {
        return size;
    }

    public String getCrustType() {
        return crustType;
    }

    public String getSauce() {
        return sauce;
    }

    public String getToppings() {
        return toppings;
    }

    public void print(){
        System.out.println("Size: "+size);
        System.out.println("Crust Type: "+crustType);
        System.out.println("Sauce: "+sauce);
        System.out.println("Toppings: "+toppings);
    }

    public static class PizzaBuilder{
        private int size;
        private String crustType;
        private String sauce;
        private String toppings;

        public Pizza build(){
            return new Pizza(this.size, this.crustType, this.sauce, this.toppings);
        }

        public PizzaBuilder size(int size){
            this.size=size;
            return this;
        }

        public PizzaBuilder crustType(String crustType){
            this.crustType=crustType;
            return this;
        }

        public PizzaBuilder sauce(String sauce){
            this.sauce=sauce;
            return this;
        }

        public PizzaBuilder toppings(String toppings){
            this.toppings=toppings;
            return this;
        }

    }
}
