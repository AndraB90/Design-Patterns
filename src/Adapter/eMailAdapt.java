package Adapter;

public class eMailAdapt implements eMailAdapter{
    private eMailData eMailData;
    private eMailService eMailService;

    public eMailAdapt(eMailData eMailData, eMailService eMailService) {
        this.eMailData = eMailData;
        this.eMailService = eMailService;
    }

    @Override
    public void convertDataFormat(){
        eMailService.processEMailService();
    }
}
