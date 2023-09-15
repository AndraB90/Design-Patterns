package TemplateMethod;

public class HandleClientEnglish extends HandleClient{

    public HandleClientEnglish(String person_name) {
        super(person_name);
        System.out.println("Starting HandleClientEnglish...");
    }

    @Override
    public void sayGreeting() {
        System.out.println("Hello "+person_name);
    }

    @Override
    public void sayBye() {
        System.out.println("Goodbye "+person_name);
    }
}//end class
