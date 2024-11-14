import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> friends;
    private List<Post> posts;

    public User(String username){
        this.username = username;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList();
    }

    public void addFriend(User user){
        if (!friends.contains(user) && !user.equals(this)){
            this.friends.add(user);
            user.friends.add(this);
        } else if (friends.contains(user)){
            System.out.println("You already have " + user.getUsername() + " as a friend.");
        }
    }

    public String getUsername(){
        return username;
    }

    public void createPost(String content){
        Post post = new Post(content,this);
        posts.add(post);
    }

    public List<Post> getPosts(){
        return posts;
    }

    public List<User> getFriends(){
        return friends;
    }


}
