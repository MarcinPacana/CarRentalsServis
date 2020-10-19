package controllers;

import services.MailSender;

import javax.mail.MessagingException;
import java.io.IOException;

public class MsgSender {

    MailSender mailSender;

    public MsgSender(){
        this.mailSender = MailSender.getInstance();
    }

    public boolean send(String mail, String title, String cont) throws MessagingException, IOException {
        boolean b = mailSender.sendMail(mail, title, cont);
        return b;
    }
}
