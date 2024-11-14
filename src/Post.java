public class Post {
    private String content;
    private User author;
    private int likes;

    public Post(String content, User author){
        this.content = content;
        this.author = author;
        this.likes = 0;
    }

    public void like(){
        likes++;
    }

    public void printPost(){
        System.out.println("Indhold: " + content);
        System.out.println("Forfatter: " + author.getUsername());
        System.out.println("Likes: " + likes);
    }
}
