package Singleton;

public class MySingleton {
    private static MySingleton instance;

    static{
        instance = new MySingleton();
    }

    private MySingleton(){
        System.out.println("Creating Singleton.Singleton.MySingleton object...");
    }

    public static MySingleton getInstance(){
        return instance;
    }

    public void testSingleton(){
        System.out.println("Hey.... Instance got created...");
    }
}
