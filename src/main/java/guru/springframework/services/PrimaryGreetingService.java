package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary//if there is more than one bean, i wanna use this one
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting(){
        return "Hello - from the primary greeting service";
    }
}
