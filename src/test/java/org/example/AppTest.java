package org.example;

import org.example.model.UserService;
import org.junit.jupiter.api.Test;


public class AppTest {
    @Test
    public void shouldAnswerWithTrue() {
        UserService userService = new UserService();
        var person = userService.findAutoById(3);
        person.setUsername("Not a Pavel");

        userService.updateUser(person);
    }
}
