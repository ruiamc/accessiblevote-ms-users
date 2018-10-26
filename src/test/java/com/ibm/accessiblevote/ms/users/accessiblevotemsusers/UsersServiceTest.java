package com.ibm.accessiblevote.ms.users.accessiblevotemsusers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

import com.ibm.accessiblevotecommonlib.entities.User;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class UsersServiceTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void getUsers_returnsOK(){
        try {
            ArrayList<User> ret = new ArrayList<>();
            final ResponseEntity<User> entity;
            entity = restTemplate.getForEntity("/users", User.class);
            assertThat(entity.getStatusCode()).isEqualTo(HttpStatus.OK); // assert validates that service responds with HTTP 200 code
        } catch (Exception e)
        {
            System.out.println("******** E X C E P T I O N *********************");
            System.out.println(e.getMessage());
        }

    }

}
