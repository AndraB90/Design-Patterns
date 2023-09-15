package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton=Singleton.getInstance();
        Singleton singleton1=Singleton.getInstance();
        SingletonWithoutSinchronized singletonWithoutSinchronized= SingletonWithoutSinchronized.getInstance();
        SingletonWithoutSinchronized singletonWithoutSinchronized1= SingletonWithoutSinchronized.getInstance();

        ThreadLocalSingleton threadLocalSingleton=ThreadLocalSingleton.getInstance();


        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singletonWithoutSinchronized);
        System.out.println(singletonWithoutSinchronized1);
        System.out.println(threadLocalSingleton);

        /*Multithreading*/

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        Thread t1 = new Thread(myThread1, "Thread 1");
        Thread t2 = new Thread(myThread2, "Thread 2");

        t1.start();
        t2.start();



    }
}
