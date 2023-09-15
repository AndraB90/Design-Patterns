package TemplateMethod;

public class HandleClientJapanese extends HandleClient{
    public HandleClientJapanese(String person_name) {
        super(person_name);
        System.out.println("Starting HandleClientJapanese...");
    }

    @Override
    public void sayGreeting() {
        System.out.println("Konichiwa "+person_name);
    }

    @Override
    public void sayBye() {
        System.out.println("Sayonara "+person_name);
    }
}
