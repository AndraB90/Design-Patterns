package TemplateMethod;

public class Google extends WebScraping{
    public Google(String site_name) {
        super(site_name);
        System.out.println("Going on a search...");
    }

    @Override
    public void makeRequest() {
        System.out.println("Searching the weather on "+site_name);
    }

    @Override
    public void parsingHTML() {
        System.out.println("Reading the weather from "+site_name);
    }

    @Override
    public void extractingData() {
        System.out.println("Storing the weather forecast from "+site_name+ " on my phone");
    }
}
