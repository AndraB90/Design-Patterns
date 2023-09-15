package Adapter;

public class MessageDriver {
    public static void main(String[] args) {
        MessagingFormat messagingFormat=new MessagingFormat();

        AppOwnFormat appOwnFormat= new AppOwnFormat();

        messageAdapter messageAdapter=new messageAdapt(messagingFormat, appOwnFormat);

        messageAdapter.processInformation();
    }
}
