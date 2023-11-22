package me.fullstackgabe.service;

import me.fullstackgabe.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
