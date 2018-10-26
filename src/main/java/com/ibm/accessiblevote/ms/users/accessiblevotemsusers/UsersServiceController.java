package com.ibm.accessiblevote.ms.users.accessiblevotemsusers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.accessiblevotecommonlib.entities.User;

import java.util.ArrayList;

@RestController
public class UsersServiceController {

    @GetMapping("/users")
    public User getUsers() {
        ArrayList<User> u;
        u = new ArrayList<User>(1);
        u.add(new User(2, "User 2", true));
        return ((User)u.get(0));
    }
}