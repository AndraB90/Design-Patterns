package Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class UserPublisher {
    protected List<iChatJointUser>_user=new ArrayList<>();

    public void addChatUser(iChatJointUser user){
        _user.add(user);
    }

    public void removeChatUser(iChatJointUser user){
        _user.remove(user);
    }

    public void notifyChatUsers(){
        for(var user:_user){
            user.update();
        }
    }
}
