public class Main {
    public static void main(String[] args) {
        SocialNetwork network = new SocialNetwork();

        User enes = new User("Enes");
        User abdul = new User("Abdul");
        User robin = new User("Robin");

        network.addUser(enes);
        network.addUser(abdul);
        network.addUser(robin);

        enes.addFriend(abdul);
        abdul.addFriend(robin);

        enes.createPost("Hello World.");
        abdul.createPost("This is just the beginning.");
        robin.createPost("or is it?");

        enes.getPosts().getFirst().like();
        enes.getPosts().getFirst().like();
        abdul.getPosts().getFirst().like();
        abdul.getPosts().getFirst().like();
        abdul.getPosts().getFirst().like();

        System.out.println("Enes's venners opslag:");
        network.showFriendsPosts(enes);

        System.out.println("Abdul's venners opslag:");
        network.showFriendsPosts(abdul);
    }
}
