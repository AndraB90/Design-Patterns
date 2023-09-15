package TemplateMethod;

public abstract class GenerationSystem {
    protected String system_name="";

    public GenerationSystem(String system_name) {
        this.system_name = system_name;
    }

    public abstract void retrievingData();
    public abstract void formattingInput();

    public void handleGenerationSystem(){
        retrievingData();
        formattingInput();
        System.out.println("The Report is ready! ");
    }
}
