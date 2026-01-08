package repositories;

import repositories.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import entities.User;

public class UserRepositoryImp  implements UserRepository {
    private final Map<Long, User> usersRepoById = new HashMap<>();

    @Override
    public User findUserById(long id){
        return usersRepoById.get(id);
    }
    @Override
    public User findUserByUsername(String username){
        for(User user : usersRepoById.values()){
            if(user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User findUserByEmail(String email){
        for(User user : usersRepoById.values()){
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    @Override
    public ArrayList<User> findAllUsers(){
        return new ArrayList<>(usersRepoById.values());
    }

    @Override
    public void saveUser(User user){
        usersRepoById.put(user.getId(),user);
    }

    @Override
    public void deleteUser(User user){
        usersRepoById.remove(user.getId());
    }
}