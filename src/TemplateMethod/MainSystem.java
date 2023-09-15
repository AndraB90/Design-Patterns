package TemplateMethod;

public class MainSystem {
    public static void main(String[] args) {
        GenerationSystem generationSystem=new SalesReports("Wall Street Journal");
        generationSystem.handleGenerationSystem();

        GenerationSystem generationSystem1=new InventoryReports("Amazon");
        generationSystem1.handleGenerationSystem();
    }
}
