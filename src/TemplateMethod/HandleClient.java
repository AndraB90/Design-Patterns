package TemplateMethod;

public abstract class HandleClient {
    protected String person_name="";

    public HandleClient(String person_name) {
        this.person_name = person_name;
    }

    public abstract void sayGreeting();
    public abstract void sayBye();

    public void handleClient(){
        sayGreeting();
        //call ChatBot to respond to client
        System.out.println("Doing something which the client needs");
        sayBye();
    }
}//end class
