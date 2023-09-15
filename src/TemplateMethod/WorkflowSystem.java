package TemplateMethod;

public abstract class WorkflowSystem {
    protected String system_name="";

    public WorkflowSystem(String system_name) {
        this.system_name = system_name;
    }

    public abstract void dataEntry();
    public abstract void review();
    public abstract void approval();
    public abstract void finalization();

    public void handleWorkflow(){
        dataEntry();
        review();
        approval();
        finalization();
    }
}
