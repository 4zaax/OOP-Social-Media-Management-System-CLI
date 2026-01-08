package entities;

import entities.User;
import entities.enums.Role;

public class Admin extends User {
    public Role getRole (){
        return Role.ADMIN;
    }
}