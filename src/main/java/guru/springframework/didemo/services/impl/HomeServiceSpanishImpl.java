package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.HomeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Profile("es")
public class HomeServiceSpanishImpl implements HomeService {
    @Override
    public String greetingMessage() {
        return "Hello Darling in SPANISH   !!";
    }
}
