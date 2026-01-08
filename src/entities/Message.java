package entities;
import java.time.Instant;

public class Message {
    private static int idCounter = 0;
    private int id;

    private final int senderId;
    private Instant createdAt;
    private String content;


    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public int getSenderId() {
        return senderId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Message(int senderId, String content) {
       this.senderId = senderId;
       this.content = content;
       this.id = idCounter++;
       this.createdAt = Instant.now();
    }

}