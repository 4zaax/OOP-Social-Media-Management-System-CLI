package entities.interactions;

import entities.Interaction;

import entities.User;

public class Comment extends Interaction {
    private static int idCounter = 0;
    private int id;
    private String comment;
    public Comment(User user, String comment) {
        super(user);
        this.comment = comment;
        this.id = idCounter++;
    }

}
