package Singleton;
import java.lang.ThreadLocal;

public class ThreadLocalSingleton {
    private ThreadLocalSingleton(){}

    private static class SingletonHelper{
        private static final ThreadLocal<ThreadLocalSingleton> INSTANCE = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());
    }

    public static ThreadLocalSingleton getInstance(){
        return SingletonHelper.INSTANCE.get();
    }
}
