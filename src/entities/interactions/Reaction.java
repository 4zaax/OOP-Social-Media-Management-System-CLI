package entities.interactions;

import entities.Interaction;
import entities.User;
import entities.enums.ReactionType;

public class Reaction extends Interaction {
    public ReactionType reactionType;
    public Reaction(User user, ReactionType type) {
        super(user);
        this.reactionType = type;
    }
}