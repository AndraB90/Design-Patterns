package Adapter;

public class FormatDriver {
    public static void main(String[] args) {
        proprietaryFormat proprietaryFormat=new proprietaryFormat();
        appFormat appFormat= new appFormat();

        formatAdapter formatAdapter=new FormatAdapt(proprietaryFormat, appFormat);
        formatAdapter.convertFormat();
    }
}
