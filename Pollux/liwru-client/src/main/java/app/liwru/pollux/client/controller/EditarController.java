package app.liwru.pollux.client.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EditarController {

    @GetMapping("/editar/agraviado")
    public String EditarAgraviado() {
        return "editar/agraviado/index";
    }

    @GetMapping("/editar/usuario")
    public String EditarUsuario() {
        return "editar/usuario/index";
    }

    @GetMapping("/editar/incidencia")
    public String EditarIncidencia() {
        return "editar/incidencia/index";
    }

    @GetMapping("/editar/sede")
    public String EditarSede() {return "editar/sede/index"; }

}
