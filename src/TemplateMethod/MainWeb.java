package TemplateMethod;

public class MainWeb {
    public static void main(String[] args) {
        WebScraping webScraping=new Blog("Blog2Inspireyourself.com");
        webScraping.handleWebScraping();

        WebScraping webScraping1=new Google("Google.com/weather");
        webScraping1.handleWebScraping();
    }
}
