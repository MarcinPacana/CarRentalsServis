package controllers;

import encje.User;
import services.UserService;

public class NewUserController {

    private UserService userService;

    public NewUserController(){
        this.userService = new UserService();
    }

    public boolean emailExist(String email){
        return userService.emailExist(email);
    }

    public boolean addNewUser(User user){
        boolean existsMail = userService.emailExist(user.getMail());
        if (existsMail == false){
            userService.addNewUser(user);
            return true;
        }else {
            return false;
        }
    }

    public boolean activateUser(String token){
        boolean isExist = userService.tokenExist(token);
        if (isExist){
            userService.activateUser(token);
            return true;
        } else {
            return false;
        }
    }

    public boolean isActivated(String token){

        return true;
    }

    public boolean update(User user){
        return true;
    }
}
