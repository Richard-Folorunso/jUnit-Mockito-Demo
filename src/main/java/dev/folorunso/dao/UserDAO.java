package dev.folorunso.dao;

import dev.folorunso.models.User;

import java.util.Optional;

public class UserDAO {

    public Optional<User> findById(int id) {
        return Optional.of(new User());
    }
}
