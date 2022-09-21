package dev.folorunso.services;

import dev.folorunso.dao.UserDAO;
import dev.folorunso.models.User;

import java.util.Optional;

public class UserService {

    UserDAO userDAO;
    public Optional<User> getUserById(int id) {
        if (id < 0) { return null; }
        return userDAO.findById(id);
    }
}
