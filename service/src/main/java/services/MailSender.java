package services;

import java.io.*;
import java.io.FileInputStream;
import java.util.Properties;
import javax.mail.*;
import javax.mail.Address;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class MailSender {

    private static MailSender instance;
    private static File propertiesFileXML = new File("C:\\Projekty IT\\PORTFOLIIO\\projectcar\\service\\src\\main\\resources\\mailconfg.xml");
    private Properties prop;
    private static String PASSWORD = "Samuraj1234";
    private static String TO = "marcinfiber@gmail.com";

    private MailSender(){
    }

    static {
        instance = new MailSender();
        instance.createProp();
    }

    public static MailSender getInstance(){
        return instance;
    }

    public boolean sendMail(String toUser, String title, String cont){
        Session session = Session.getDefaultInstance(prop);

        try {
            Message message = new MimeMessage(session);
            String from = prop.getProperty("mail.smtps.user");
            Address addressFrom = new InternetAddress(from);
            message.setFrom(addressFrom);
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(TO));
            message.setSubject(title);
            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(cont,"text/html");
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);
            message.setContent(multipart);

            Transport transport = session.getTransport();
            try{
                transport.connect(null,PASSWORD);
                transport.sendMessage(message,message.getAllRecipients());
            }finally {
                transport.close();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }

    protected   Properties createProp(){
        FileInputStream in = null;
        try {
            in = new FileInputStream(propertiesFileXML);
            this.prop = new Properties();
            this.prop.loadFromXML(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }

    private void setPASSWORD(String password){
        MailSender.PASSWORD = password;
    }

    public static void setTO(String TO) {
        MailSender.TO = TO;
    }
}
