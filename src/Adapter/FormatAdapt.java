package Adapter;

public class FormatAdapt implements formatAdapter{
    private proprietaryFormat proprietaryFormat;
    private appFormat appFormat;

    public FormatAdapt(proprietaryFormat proprietaryFormat, appFormat appFormat) {
        this.proprietaryFormat = proprietaryFormat;
        this.appFormat = appFormat;
    }

    @Override
    public void convertFormat(){
        appFormat.processAppFormat();
    }
}
