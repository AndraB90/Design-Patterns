package Adapter;

public class Data2Adapt implements Data2Adapter{
    private DatabaseFormat databaseFormat;
    private ApplicationFormat applicationFormat;

    public Data2Adapt(DatabaseFormat databaseFormat, ApplicationFormat applicationFormat) {
        this.databaseFormat = databaseFormat;
        this.applicationFormat = applicationFormat;
    }

    @Override
    public void processData(){
        applicationFormat.processAppData();
    }
}
