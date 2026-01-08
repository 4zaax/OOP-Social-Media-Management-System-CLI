package repositories;

import entities.User;

import java.util.ArrayList;

public interface UserRepository {
    User findUserByUsername(String username);
    User findUserById(long id);
    User findUserByEmail(String email);
    ArrayList<User> findAllUsers();
    void saveUser(User user);
    void deleteUser(User user);
}