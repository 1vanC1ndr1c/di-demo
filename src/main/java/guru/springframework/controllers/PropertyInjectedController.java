package guru.springframework.controllers;


import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

//everything wrong in this one
//not to do like this
@Controller
public class PropertyInjectedController {

    @Autowired//important stuff
    public GreetingServiceImpl greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }


}
