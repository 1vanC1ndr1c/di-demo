package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("de")
@Primary//although there are 3 primary now, it will be ignored because this profile is currently not active
//to activate it -> application.properties spring.profiles.active=ge
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Primarer Gurssdienst";
    }
}
