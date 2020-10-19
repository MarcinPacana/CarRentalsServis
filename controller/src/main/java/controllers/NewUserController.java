package controllers;

import encje.User;
import services.UserService;

public class NewUserController {

    private UserService userService = new UserService();

        public boolean addNewUser(User user){
            boolean existsMail = userService.isExists(user.getMail());
            if (existsMail == false){
                userService.addNewUser(user);
                return true;
            }else {
                return false;
            }
        }
}
