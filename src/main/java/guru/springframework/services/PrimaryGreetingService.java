package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/*
@Service
@Primary//if there is more than one bean, i wanna use this one
@Profile({"en", "default"})//active if no active profile or en is active
*/
//better to use all annotations in one config file
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting(){
        return "Hello - from the primary greeting service";
    }
}
