package hello.graphqlinspringboot.controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @QueryMapping
    public String hello() {
        return "안녕 GraphQL!";
    }

    @QueryMapping
    public String name(){
        return "허동운";
    }
}

