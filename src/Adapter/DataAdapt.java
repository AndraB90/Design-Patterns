package Adapter;

public class DataAdapt implements DataAdapter{

    private APIPropietaryFormat apiPropietaryFormat;
    private OwnAppFormat ownAppFormat;

    public DataAdapt(APIPropietaryFormat apiPropietaryFormat, OwnAppFormat ownAppFormat) {
        this.apiPropietaryFormat = apiPropietaryFormat;
        this.ownAppFormat = ownAppFormat;
    }

    @Override
    public void transformData(){
        ownAppFormat.processOwnAppFormat();
    }
}
