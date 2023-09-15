package TemplateMethod;

public class InventoryReports extends GenerationSystem{
    public InventoryReports(String system_name) {
        super(system_name);
        System.out.println("Starting inventory report...");
    }

    @Override
    public void retrievingData() {
        System.out.println("Scanning through..."+system_name);
    }

    @Override
    public void formattingInput() {
        System.out.println("Clean data base from..."+system_name);
    }
}
