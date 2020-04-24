package guru.springframework.controllers;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;

/**
 * @Project mb2g-mm-maven
 * Created by @Author Parinit on 4/24/2020
 * at 11:40 PM
 */
public class UserController {

    User saveUser(UserCommand command) {

        // fake impl
        return new User();
    }
}
