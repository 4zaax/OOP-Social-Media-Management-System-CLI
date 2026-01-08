package entities;

import entities.enums.PostType;

import java.time.Instant;
import java.util.ArrayList;
public abstract class Post {
    private static int idCounter = 0;
    private  int id;
    private final String authorUsername;
    private PostType type;
    private  Instant createdAt = Instant.now();
    private String caption;
    private boolean pinned;

    private final ArrayList<Interaction> interactions = new ArrayList<>();
    private int viewCount;
    private final ArrayList<User> viewers = new ArrayList<>();

    public abstract String getPostType();

    public Post(User user, PostType type,String caption){
        this.id = idCounter++;
        this.authorUsername = user.getUsername();
        this.type = type;
        this.createdAt = Instant.now();
        this.caption = caption;
        this.pinned = false;
    }
}