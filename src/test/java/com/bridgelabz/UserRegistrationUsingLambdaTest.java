package com.bridgelabz;
import bridgelabz.UserRegistrationUsingLambda;
import org.junit.jupiter.api.*;

public class UserRegistrationUsingLambdaTest {
    static UserRegistrationUsingLambda userRegistration;

    @BeforeAll
    public static void init() {
        System.out.println("Before all");
        userRegistration = new UserRegistrationUsingLambda();
    }

    @Test
    void givenFirstnameshouldreturnTrue() {
        boolean value = userRegistration.validate("Rajnish");
        Assertions.assertTrue(value);
        System.out.println("First Name Checked:- Successfully passed UC1");
    }

    @Test
    void givenLastnameshouldreturnTrue() {
        boolean value = userRegistration.validateLastName("Kumar");
        Assertions.assertTrue(value);
        System.out.println("Last Name Checked :- Successfully Passed UC2");
    }

    @Test
    void GivenEmailShouldReturnTrue() {
        boolean Email = userRegistration.validateEmail("Rajneeshsingh2308@gmail.com");
        Assertions.assertTrue(Email);
        System.out.println("Email Checked");

    }

    @Test
    void GivenPhoneNUmberShouldReturnTrue() {
        boolean phonenumber = userRegistration.validatePhoneNumber("917541061533");
        Assertions.assertTrue(phonenumber);
        System.out.println("Phonenumber Checked");
    }

    @Test
    void GivenPasswordShouldWrittenTrue() {
        boolean password = userRegistration.ValidatePassword("Rajnishr");
        Assertions.assertTrue(password);
        System.out.println("Password Checked(Rule 1 And 2 Checked)");
    }
}
