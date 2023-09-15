package TemplateMethod;

public class SalesReports extends GenerationSystem{
    public SalesReports(String system_name) {
        super(system_name);
        System.out.println("Starting sales report...");
    }

    @Override
    public void retrievingData() {
        System.out.println("Reading the sale report "+system_name);
    }

    @Override
    public void formattingInput() {
        System.out.println("Organizing Data from "+system_name+" in a table");
    }
}
