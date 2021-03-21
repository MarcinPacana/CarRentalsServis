package service;

import encje.User;

import java.util.List;

public interface UserDaoInt {

    void save(User user);
    void update(User user);
    void delete(User user);
    User findByUserId(Long userId);
    User findByUserName(String userName);
    List<User> getAllUsers();
}
