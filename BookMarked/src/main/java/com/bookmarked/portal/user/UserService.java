package com.bookmarked.portal.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private List<UserAccount> users = new ArrayList<>();

    public void registerUser(UserAccount user) {
        if (!isUsernameTaken(user.getUsername())) {
            users.add(user);
            System.out.println("User registered: " + user.getUsername());
        }
    }

    public void deleteUser(String username) {
        UserAccount userToRemove = getUserByUsername(username);

        if (userToRemove != null) {
            users.remove(userToRemove);
            System.out.println("User deleted: " + userToRemove.getUsername());
        } else {
            System.out.println("User not found.");
        }
    }

    private UserAccount getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    private boolean isUsernameTaken(String username) {
        return users.stream()
                .anyMatch(user -> user.getUsername().equals(username));
    }
}
