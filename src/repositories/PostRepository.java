package repositories;

import entities.Post;

import java.util.ArrayList;

public interface PostRepository {
    Post findPostById(long id);
    Post  findPostByUserId(long id);
    ArrayList<Post> findAllPosts();
    void savePost(Post post);
    void deletePostById(long id);
}