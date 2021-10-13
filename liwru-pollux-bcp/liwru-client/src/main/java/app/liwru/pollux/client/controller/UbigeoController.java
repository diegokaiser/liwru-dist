package app.liwru.pollux.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UbigeoController {



    @GetMapping("/ubigeo")
    public String ubigeo() {
        return "ubigeo/index";
    }

    @GetMapping("/ubigeo/distrito")
    public String distrito() {
        return "ubigeo/distrito/index";
    }

    @GetMapping("/ubigeo/provincia")
    public String provincia() {
        return "ubigeo/provincia/index";
    }

    @GetMapping("/ubigeo/departamento")
    public String departamento() {
        return "ubigeo/departamento/index";
    }


}