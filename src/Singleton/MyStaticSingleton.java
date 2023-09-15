package Singleton;

public class MyStaticSingleton {
    public static void main(String a[]){
        MySingleton ms = MySingleton.getInstance();
        ms.testSingleton();
    }
}
