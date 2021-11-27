package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.EstadoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajustes")
@Controller
public class EstadoController {

    private final EstadoService estadoService;

    public EstadoController(EstadoService estadoService) {
        this.estadoService = estadoService;
    }


    @GetMapping("/estados")
    public String motivo(Model model)
    {
        estadoService.getEstados().ifPresent(estados -> model.addAttribute("estados", estados));

        return "ajustes/estados/index";
    }


}
