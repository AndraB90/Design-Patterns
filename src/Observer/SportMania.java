package Observer;

public class SportMania {
    public static void main(String[] args) {
        SportGroupPublisher sportGroupPublisher=new SportGroupPublisher();
        SportGroupChatUsers sportGroupChatUser1=new SportGroupChatUsers(sportGroupPublisher);
        SportGroupChatUsers sportGroupChatUser2=new SportGroupChatUsers(sportGroupPublisher);
        SportGroupChatUsers sportGroupChatUser3=new SportGroupChatUsers(sportGroupPublisher);

        sportGroupPublisher.set_lastSportInfo("Chelsea - Arsenal 1:1");


    }
}
