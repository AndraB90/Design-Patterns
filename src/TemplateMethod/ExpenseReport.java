package TemplateMethod;

public class ExpenseReport extends WorkflowSystem{
    public ExpenseReport(String system_name) {
        super(system_name);
        System.out.println("Starting Expense Report..."+system_name);
    }

    @Override
    public void dataEntry() {
        System.out.println("Enter new data into "+system_name);
    }

    @Override
    public void review() {
        System.out.println("Checking existent data of "+system_name);
    }

    @Override
    public void approval() {
        System.out.println("Data is approved!");
    }

    @Override
    public void finalization() {
        System.out.println("Shutting down data base");
    }
}
