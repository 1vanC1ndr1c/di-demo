package guru.springframework.controllers;


import guru.springframework.services.GreetingService;
import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//everything wrong in this one
//not to do like this
@Controller
public class PropertyInjectedController {

    @Autowired//important stuff
    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayGreeting();
    }


}
