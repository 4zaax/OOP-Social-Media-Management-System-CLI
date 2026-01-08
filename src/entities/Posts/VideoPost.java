package entities.Posts;

import entities.Post;

public class VideoPost extends Post {
    @Override
    public String getPostType(){return "Video";}
}