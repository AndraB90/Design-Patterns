package Adapter;

public class messageAdapt implements messageAdapter{
    private MessagingFormat messagingFormat;
    private AppOwnFormat appOwnFormat;

    public messageAdapt(MessagingFormat messagingFormat, AppOwnFormat appOwnFormat) {
        this.messagingFormat = messagingFormat;
        this.appOwnFormat = appOwnFormat;
    }

    @Override
    public void processInformation(){
        appOwnFormat.processAppData();
    }
}
