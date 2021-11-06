package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuariosController {

    private final UsuarioService usuarioService;

    public UsuariosController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }


    @GetMapping("/usuarios")
    public String usuarios(Model model) {
        usuarioService.getUsuarios().ifPresent(usuarios -> model.addAttribute("usuarios", usuarios));

        return "usuarios/index";
    }
}
