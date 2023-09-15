package Observer;

public class SportGroupChatUsers implements iChatJointUser{
    SportGroupPublisher _publisher;

    public SportGroupChatUsers(SportGroupPublisher publisher){
        _publisher=publisher;
        _publisher.addChatUser(this);
    }

    @Override
    public void update(){
        String info=_publisher.get_lastSportInfo();
        System.out.println("Sport chat room received updated info "+info);
    }
}
