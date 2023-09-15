package TemplateMethod;

public class Blog extends WebScraping{
    public Blog(String site_name) {
        super(site_name);
        System.out.println("This is a Blog!");
    }

    @Override
    public void makeRequest() {
        System.out.println("Starting Request to "+site_name);
    }

    @Override
    public void parsingHTML() {
        System.out.println("Reading the Site Content of "+site_name);
    }

    @Override
    public void extractingData() {
        System.out.println("Download Article from "+site_name);
    }
}
