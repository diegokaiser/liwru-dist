package app.liwru.pollux.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login2() {
        return "login/index";
    }

    @GetMapping("/recover")
    public String recover() {
        return "recover/index";
    }

}
