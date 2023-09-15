package Adapter;

public class DataDriver {
    public static void main(String[] args) {
        APIPropietaryFormat apiPropietaryFormat=new APIPropietaryFormat();
        OwnAppFormat ownAppFormat=new OwnAppFormat();
        DataAdapter dataAdapter=new DataAdapt(apiPropietaryFormat, ownAppFormat);
        dataAdapter.transformData();
    }
}
