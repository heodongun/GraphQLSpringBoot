package hello.graphqlinspringboot.controller;
import hello.graphqlinspringboot.DTO.User;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @QueryMapping(name="ping")
    public String ping() {
        return "pong";
    }

    @QueryMapping(name="user")
    public User[] name(){
        User[] users = new User[2];
        users[0]=User.builder().name("heodongun").id("1").age(18).build();
        users[1]=User.builder().name("heodongun0218").id("2").age(19).build();

        return users;
    }
}

