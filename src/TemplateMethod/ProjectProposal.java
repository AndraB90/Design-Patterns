package TemplateMethod;

public class ProjectProposal extends WorkflowSystem{
    public ProjectProposal(String system_name) {
        super(system_name);
        System.out.println("Starting Project Proposal..."+system_name);
    }

    @Override
    public void dataEntry() {
        System.out.println("Enter new content into "+system_name);
    }

    @Override
    public void review() {
        System.out.println("Checking report "+system_name);
    }

    @Override
    public void approval() {
        System.out.println("Validate report "+system_name);
    }

    @Override
    public void finalization() {
        System.out.println("The report "+system_name+" has been finished!");
    }
}
