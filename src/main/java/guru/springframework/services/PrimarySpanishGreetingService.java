package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("es")
@Primary//although there are 2 primary, it will be ignored because this profile is currently not active
//to activate it -> application.properties spring.profiles.active=es
public class PrimarySpanishGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Servicio de saludo primario";
    }
}
