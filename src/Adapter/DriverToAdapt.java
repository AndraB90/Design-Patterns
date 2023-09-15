package Adapter;

public class DriverToAdapt {
    public static void main(String[] args) {
        DatabaseFormat databaseFormat=new DatabaseFormat();
        ApplicationFormat applicationFormat=new ApplicationFormat();
        Data2Adapter data2Adapter=new Data2Adapt(databaseFormat, applicationFormat);
        data2Adapter.processData();
    }
}
