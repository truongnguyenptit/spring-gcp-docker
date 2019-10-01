package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return "Hello K003!";
    }

    @RequestMapping("/signin")
    public String sigin() {
        return "Hello Guys! Feature signin";
    }
}
