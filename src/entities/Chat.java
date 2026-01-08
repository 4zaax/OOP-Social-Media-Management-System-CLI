package entities;

import entities.enums.ChatType;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class Chat {
    private static long idCounter = 0;
    private final long id;
    private final ChatType type;
    private String name;
    private final Set<User> participants = new HashSet<User>();
    private final ArrayList<Message> messages = new ArrayList<Message>();

    public Chat(ChatType type, String name) {
        this.id = idCounter++;
        this.type = type;
        this.name = name;
    }
    public long getId() {return id;}
    public ChatType getType() {return type;}
    public String getName() {return name;}
    public Set<User> getParticipants() {return participants;}
    public ArrayList<Message> getMessages() {return messages;}
    public void addMessage(Message message) {
        messages.add(message);
    }
    public void removeMessage(Message message) {
        messages.remove(message);
    }
    public void SetName(String newName) {
        name = newName;
    }
}