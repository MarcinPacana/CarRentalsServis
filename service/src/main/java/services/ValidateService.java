package services;

import dao.UserDao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateService {

    UserDao userDao = new UserDao();

    public boolean chekMail(String mail){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(mail);
        if (matcher.matches())  return true;
        else return false;
    }

    public boolean auth(String pwdFRONT, String pwdBACK){
        System.out.println("weszlo do auth");
        if (pwdFRONT.equals(pwdBACK)) return true;
        else return false;
    }



}
