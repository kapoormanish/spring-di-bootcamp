package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

    private HomeService homeService;

    public HomeController(@Qualifier("homeServiceImpl2") HomeService homeService) {
        this.homeService = homeService;
    }

    public void hello(){
        System.out.println(homeService.greetingMessage());
    }
}
