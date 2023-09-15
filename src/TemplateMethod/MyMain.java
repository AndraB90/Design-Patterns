package TemplateMethod;

public class MyMain {
    public static void main(String[] args) {

        HandleClient hc=new HandleClientEnglish("John");
        hc.handleClient();

        HandleClient hc2=new HandleClientJapanese("Doraemon");
        hc2.handleClient();

        HandleClient hc3=new HandleClientSpanish("Dora");
        hc3.handleClient();

    }
}
