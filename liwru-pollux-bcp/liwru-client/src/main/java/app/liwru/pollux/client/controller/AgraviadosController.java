package app.liwru.pollux.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgraviadosController {

    @GetMapping("/agraviados")
    public String agraviados() {
        return "agraviados/index";
    }
}
