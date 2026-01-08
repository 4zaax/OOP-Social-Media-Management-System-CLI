package repositories;

import entities.Chat;

import java.util.ArrayList;

public interface ChatRepository {
    Chat findById(String id);
    ArrayList<Chat> findAll();
    Chat save(Chat chat);
    void delete(Chat chat);
}