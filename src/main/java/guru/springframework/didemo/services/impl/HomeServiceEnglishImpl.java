package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.HomeService;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Service
@Primary
@Profile("en")
public class HomeServiceEnglishImpl implements HomeService {
    @Override
    public String greetingMessage() {
        return "Hello Darling in ENGLISH";
    }
}
