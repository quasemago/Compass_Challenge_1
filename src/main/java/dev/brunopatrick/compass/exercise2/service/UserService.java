package dev.brunopatrick.compass.exercise2.service;

import dev.brunopatrick.compass.exercise2.model.User;

import java.util.ArrayList;

public class UserService {
    // Simulated database.
    private final ArrayList<User> users = new ArrayList<>();

    public void createUser(String username, String password) {
        users.add(new User(username, password));
    }

    /**
     * @return true on successful login, false otherwise.
     */
    public boolean login(String username, String password) {
        // Try to find the user with the given username and password.
        final User user = users.stream()
                .filter(u -> u.getUsername().equals(username)
                        && u.getPassword().equals(password))
                .findFirst()
                .orElse(null);

        // Check if the user was found with the given username and password.
        return (user != null);
    }
}
