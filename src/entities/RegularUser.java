package entities;

import entities.enums.Role;

public class RegularUser extends User {
    public Role getRole(){
        return Role.REGULAR;
    }
}