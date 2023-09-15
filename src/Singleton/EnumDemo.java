package Singleton;

public class EnumDemo {
    public static void main(String[] args) {
        Singleton1 singleton = Singleton1.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
