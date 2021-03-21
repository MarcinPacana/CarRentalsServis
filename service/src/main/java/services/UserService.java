package services;

import dao.UserDao;
import encje.User;

public class UserService {

    private UserDao userDao = new UserDao();
    private MailSender mailSender = MailSender.getInstance();
    private final String baseURL = "http://localhost:8080/confirm?token=";

    public boolean emailExist(String email){
        if (userDao.mailExists(email)) return true;
        else return false;
    }

    public boolean tokenExist(String token){
        User user = userDao.findUserByToken(token);
        if (user == null) return false;
        else return true;
    }

    public User getUserByToken(String token){
        return userDao.findUserByToken(token);
    }

    public void activateUser(String token){
        User user = userDao.findUserByToken(token);
        user.setActive(true);
        user.setToken(null);
        userDao.update(user);
    }

    public void addNewUser(User user){
        String token = TokenGenerate.getToken();
        user.setToken(token);
        userDao.save(user);
        String setURL = baseURL+token;
        String content = "Czesc "+user.getFirstName()+" Kliknij w link aby aktywowac swoje konto w serwisie carrental.pl "+setURL;
        User user1 = (User) userDao.findByUserName(user.getFirstName());
        String token1 = user.getToken();
        mailSender.sendMailTo(user.getMail(),"AKTYWUJ KONTO carrental.pl",content);
    }

    public String findPwdUserByEmail(String email){
        return userDao.findUserByMail(email).getPassword();
    }

    public User findUserByEmail(String email){
        return userDao.findUserByMail(email);
    }

}