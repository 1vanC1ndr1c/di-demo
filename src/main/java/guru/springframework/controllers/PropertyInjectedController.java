package guru.springframework.controllers;


import guru.springframework.services.GreetingServiceImpl;

//everything wrong in this one
//not to do like this
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello() {
        return greetingService.sayGreeting();
    }


}
