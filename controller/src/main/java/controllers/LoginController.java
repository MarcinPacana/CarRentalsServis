package controllers;

import encje.User;
import services.UserService;
import services.ValidateService;

public class LoginController {

    private UserService userService = new UserService();
    private ValidateService validateService = new ValidateService();

    public User logIn(String mail, String pwd){
        if (validateService.chekMail(mail)){
            if (userService.emailExist(mail)){
                String password = userService.findPwdUserByEmail(mail);
                boolean auth = validateService.auth(password, pwd);
                if (auth){
                    return userService.findUserByEmail(mail);
                }
            }
        }
        return null;
    }
}
