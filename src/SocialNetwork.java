import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    private List<User> users;

    public SocialNetwork() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        if (!users.contains(user)){
            users.add(user);
            System.out.println("You have successfully added " + user.getUsername() + " to your network.");
        } else {
            System.out.println("The user is already a part of the network.");
        }
    }

    public void showFriendsPosts(User user){
        for (User friend : user.getFriends()){
            System.out.println("Opslag fra " + friend.getUsername() + ":");
            for (Post post : friend.getPosts()){
            post.printPost();
            System.out.println();

            }
        }
    }
}
