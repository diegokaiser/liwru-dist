package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.AgraviadosService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgraviadosController {

    private final AgraviadosService agraviadosService;

    public AgraviadosController(AgraviadosService agraviadosService) {
        this.agraviadosService = agraviadosService;
    }

    @GetMapping("/agraviados")
    public String agraviados(Model model) {

        agraviadosService.getAgraviados().ifPresent(agraviados -> model.addAttribute("agraviados", agraviados));
        return "agraviados/index";
    }
}
