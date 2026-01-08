package entities;
import entities.enums.PrivacySetting;
import entities.enums.Role;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
public abstract class User {
    private static int idCounter = 0;

    private long  id;
    private String username;
    private String passwordHashed;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String alias;
    private Role role;
    private PrivacySetting privacySetting;
    private boolean banned;
    // although we may encounter contradiction i preferred to have better performance
    // by keeping both followings and followers
    private final Set<User> followings = new HashSet<User>();
    private final Set<User> followers = new HashSet<User>();
    private final Set<User> pendings = new HashSet<User>();
    private final ArrayList<Post> posts = new ArrayList<>();
    private final ArrayList<Participant> participates = new ArrayList<>();
    // * Constructor *//
    public User(String username,
                String passwordHashed,
                String firstName,
                String lastName,
                String email,
                String phoneNumber,
                String alias) {
        idCounter++;
        this.id = idCounter ++;
        this.username = username;
        this.passwordHashed = passwordHashed;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.alias = alias;
        this.role = Role.REGULAR;
        this.banned = false;
    }

    protected User() {
    }
    //* Getters *//

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswordHashed() {
        return passwordHashed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAlias() {
        return alias;
    }

    public boolean isBanned() {
        return this.banned;
    }

    public abstract Role getRole();

    public Set<User> getPendings() {
        return pendings;
    }

    public Set<User> getFollowings() {
        return followings;
    }

    public Set<User> getFollowers() {return followers;}

    public ArrayList<Post> getPosts() {return posts;}

    public PrivacySetting getPrivacySetting() {
        return privacySetting;
    }

    public static int getIdCounter() {
        return idCounter;
    }


    // * Setters * //

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswordHashed(String passwordHashed) {
        this.passwordHashed = passwordHashed;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setPrivacySetting(PrivacySetting privacySetting) {
        this.privacySetting = privacySetting;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }
}