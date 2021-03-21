package services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void emailExistTest() {
        //given
        String mail = "marcinfiber@gmail.com";
        String mailF = "testowo@alejaja.pl";
        UserService userService = new UserService();
        //when
        boolean result = userService.emailExist(mail);
        boolean resultF = userService.emailExist(mailF);

        //then
        assertTrue(result);
        assertFalse(resultF);




    }

}