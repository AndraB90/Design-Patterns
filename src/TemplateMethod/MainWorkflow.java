package TemplateMethod;

public class MainWorkflow {
    public static void main(String[] args) {
        WorkflowSystem workflowSystem=new ExpenseReport("Excel");
        workflowSystem.handleWorkflow();

        WorkflowSystem workflowSystem1=new ProjectProposal("Research");
        workflowSystem1.handleWorkflow();
    }
}
