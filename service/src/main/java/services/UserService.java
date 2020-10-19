package services;

import dao.UserDao;
import encje.User;

public class UserService {

    private UserDao userDao;


    public boolean isExists(String mail){

        return false;
    }

    public void addNewUser(User user){
        userDao.save(user);
    }
}
