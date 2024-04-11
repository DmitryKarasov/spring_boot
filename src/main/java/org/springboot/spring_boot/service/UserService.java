package org.springboot.spring_boot.service;


import org.springboot.spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void delete(User user);

    void save(User user);

    User getById(int id);
}
