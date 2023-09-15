package TemplateMethod;

public abstract class WebScraping {
    protected String site_name="";

    public WebScraping(String site_name) {
        this.site_name = site_name;
    }

    public abstract void makeRequest();
    public abstract void parsingHTML();
    public abstract void extractingData();

    public void handleWebScraping(){
        makeRequest();
        parsingHTML();
        extractingData();
    }
}
