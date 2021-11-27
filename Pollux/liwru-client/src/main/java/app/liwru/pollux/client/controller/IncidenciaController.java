package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.EstadoService;
import app.liwru.pollux.client.service.IncidenciaService;
import app.liwru.pollux.client.service.UsuarioService;
import app.liwru.pollux.dto.IncidenciaDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class IncidenciaController {

    private final IncidenciaService incidenciaService;
    private final EstadoService estadoService;
    private final UsuarioService usuarioService;

    public IncidenciaController(IncidenciaService incidenciaService, EstadoService estadoService, UsuarioService usuarioService) {
        this.incidenciaService = incidenciaService;
        this.estadoService = estadoService;
        this.usuarioService = usuarioService;
    }


    @GetMapping("/incidencias")
    public String incidencias(Model model)
    {
        incidenciaService.getIncidencias().ifPresent(incidencias -> model.addAttribute("incidencias", incidencias));
        return "incidencias/index";
    }

    @GetMapping("/incidencias/editar/{id}")
    public String updateIncidencia(Model model,@PathVariable  Integer id) {
        incidenciaService.getIncidencia(id).ifPresent(incidencia -> model.addAttribute("incidencia",incidencia));
        estadoService.getEstados().ifPresent(estado -> model.addAttribute("estado",estado));
        usuarioService.getUsuariosPorRol().ifPresent(usuarioRol -> model.addAttribute("usuarioRol",usuarioRol));
        return "incidencias/editar/update";
    }
    @PostMapping("/incidencias/save")
    public String saveUpdate(IncidenciaDTO incidenciaDTO) {
        incidenciaService.updateIncidencia(incidenciaDTO);
        //return "redirect:/incidencias/editar/" + incidenciaDTO.getIdIncidencia();
        return "redirect:/incidencias";
    }

}

