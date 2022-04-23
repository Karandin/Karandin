package day13;

import java.util.ArrayList;
import java.util.List;


public class User {
    private String userName;
    private List<User>subscriptions;

    public String getUserName() {
        return userName;
    }

    public User(String userName) {
        this.userName = userName;
        this.subscriptions = new ArrayList<>();

    }

    @Override
    public String toString() {
        return getUserName();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

        //Methods

        public void subscribe(User user) {
            this.subscriptions.add(user);
         }

        public boolean isSubscribed(User user) {
            return this.subscriptions.contains(user);
        }

        public boolean isFriend(User user) {
            return this.isSubscribed(user) == true && user.isSubscribed(this);
        }

        public void sendMessage(User user, String text) {
            MessageDatabase.addNewMessage(this, user, text);
        }

}
