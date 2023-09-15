package TemplateMethod;

public class HandleClientSpanish extends HandleClient{

    public HandleClientSpanish(String person_name) {
        super(person_name);
        System.out.println("Starting HandleClientSpanish...");
    }

    @Override
    public void sayGreeting() {
        System.out.println("Hola "+person_name);
    }

    @Override
    public void sayBye() {
        System.out.println("Adios "+person_name);
    }
}
