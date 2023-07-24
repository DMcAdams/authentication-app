package com.example.loginservice.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginEntityTest {

    String username = "username";
    String password = "password";
    String email = "email@gmail.com";
    String firstName = "John";
    String lastName = "Doe";
    String testString= "Test!";
    LoginEntity testEntity;
    LoginEntity duplicateEntity;
    LoginEntity differentEntity;

    @BeforeEach
    void setUp() {

        testEntity = new LoginEntity(username, email, password, firstName, lastName);
        duplicateEntity = new LoginEntity(username, email, password, firstName, lastName);
        differentEntity = new LoginEntity(username, email, password, firstName, testString);

    }

    @Test
    void getUsername() {
        Assertions.assertEquals(testEntity.getUsername(), username);
    }

    @Test
    void getEmail() {
        Assertions.assertEquals(testEntity.getEmail(), email);
    }

    @Test
    void getPassword() {
        Assertions.assertEquals(testEntity.getPassword(), password);
    }

    @Test
    void getFirstName() {
        Assertions.assertEquals(testEntity.getFirstName(), firstName);
    }

    @Test
    void getLastName() {
        Assertions.assertEquals(testEntity.getLastName(), lastName);
    }

    @Test
    void setUsername() {
        testEntity.setUsername(testString);
        Assertions.assertEquals(testEntity.getUsername(), testString);
    }

    @Test
    void setEmail() {
        testEntity.setEmail(testString);
        Assertions.assertEquals(testEntity.getEmail(), testString);
    }

    @Test
    void setPassword() {
        testEntity.setPassword(testString);
        Assertions.assertEquals(testEntity.getPassword(), testString);
    }

    @Test
    void setFirstName() {
        testEntity.setFirstName(testString);
        Assertions.assertEquals(testEntity.getFirstName(), testString);
    }

    @Test
    void setLastName() {
        testEntity.setLastName(testString);
        Assertions.assertEquals(testEntity.getLastName(), testString);
    }

    @Test
    void testEquals() {
        Assertions.assertTrue(testEntity.equals(duplicateEntity));
        Assertions.assertTrue(testEntity.equals(testEntity));
        Assertions.assertFalse(testEntity.equals(differentEntity));
    }

    @Test
    void canEqual() {
        Assertions.assertTrue(testEntity.canEqual(differentEntity));

    }

    @Test
    void testHashCode() {
        Assertions.assertNotNull(testString.hashCode());
    }

    @Test
    void testToString() {
        Assertions.assertNotNull(testString.toString());
    }

    @Test
    void builder() {
        duplicateEntity = LoginEntity.builder()
                .username(username)
                .email(email)
                .password(password)
                .firstName(firstName)
                .lastName(lastName)
                .build();
        duplicateEntity.equals(testEntity);
    }
}