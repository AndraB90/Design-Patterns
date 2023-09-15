package Adapter;

public class eMailDriver {
    public static void main(String[] args) {
        eMailData eMailData=new eMailData();
        eMailService eMailService=new eMailService();

        eMailAdapter eMailAdapter=new eMailAdapt(eMailData, eMailService);
        eMailAdapter.convertDataFormat();
    }
}
