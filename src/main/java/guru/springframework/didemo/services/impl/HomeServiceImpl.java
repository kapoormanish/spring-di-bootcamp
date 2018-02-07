package guru.springframework.didemo.services.impl;

import guru.springframework.didemo.services.HomeService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public class HomeServiceImpl implements HomeService {
    @Override
    public String greetingMessage() {
        return "Hello Darling!!";
    }
}
