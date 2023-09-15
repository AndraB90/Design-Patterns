package Singleton;

/**
 * Example class that uses Singleton.Singleton class and its variables
 */
public class ExamplePgm {

    public static void main(String[] args) {
        System.out.println("Starting of Singleton.Singleton.ExamplePgm..");
        // access instance of Singleton.SingletonCls using getInstance() method
        SingletonCls instance = SingletonCls.getInstance();
        instance.setMessage("This message is set in main of Singleton.Singleton.ExamplePgm");
        displayMsg();
    }

    public static void displayMsg(){
        // Singleton.SingletonCls.getInstance() gets the instance that is already created during the call in main() method, for the first time.
        SingletonCls instance = SingletonCls.getInstance();
        System.out.println(instance.getMessage());
    }
}
