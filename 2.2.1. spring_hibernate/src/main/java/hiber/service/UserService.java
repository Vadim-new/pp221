package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getUsersList();

    List<User> getUsersListByCar(String model, int series);
}
