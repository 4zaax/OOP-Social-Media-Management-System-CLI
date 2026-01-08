package entities;

import java.util.ArrayList;

public class Participant {
    private static long participantIdCounter = 0;
    private long id;
    private ArrayList<Message> messages;
    public Participant( ) {
       this.id = participantIdCounter++;
    }
}
