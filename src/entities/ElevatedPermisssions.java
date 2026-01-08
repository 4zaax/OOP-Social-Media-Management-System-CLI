package entities;

import entities.Post;
import entities.User;

public interface ElevatedPermisssions {
    public void removePost(Post post);
    public void muteUser(User user);
    public void unmuteUser(User user);
    public void unbanUser(User user);
    public void banUser(User user);
    public void pin(Post post);
}
