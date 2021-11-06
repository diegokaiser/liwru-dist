package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.IncidenciaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IncidenciaController {

    private final IncidenciaService incidenciaService;

    public IncidenciaController(IncidenciaService incidenciaService) {
        this.incidenciaService = incidenciaService;
    }


    @GetMapping("/incidencias")
    public String incidencias(Model model)
    {
        incidenciaService.getIncidencias().ifPresent(incidencias -> model.addAttribute("incidencias", incidencias));

        return "incidencias/index";
    }

    @GetMapping("/incidencias/editar")
    public String updateIncidencia() {
        return "incidencias/editar/update";
    }

}

