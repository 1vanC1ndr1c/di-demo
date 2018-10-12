package guru.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by jt on 5/24/17.
 */

@Repository
public interface GreetingRepository {

    String getEnglishGreeting();

    String getSpanishGreeting();

    String getGermanGreeting();
}
