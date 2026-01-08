package entities.Posts;

import entities.Post;

public class ImagePost extends Post {
    @Override
    public String getPostType() {
        return "Image";
    }
}