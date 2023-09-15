package Singleton;

public class SingletonWithoutSinchronized {
    private SingletonWithoutSinchronized() {}

    private static class SingletonHolder {
        private static final SingletonWithoutSinchronized INSTANCE = new SingletonWithoutSinchronized();
    }

    public static SingletonWithoutSinchronized getInstance() {
        return SingletonHolder.INSTANCE;
    }
}