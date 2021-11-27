package app.liwru.pollux.client.controller;

import app.liwru.pollux.client.service.EmpresaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/ajustes")
@Controller
public class EmpresaController {

    private final EmpresaService empresaService;

    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/empresa")
    public String empresa(Model model)
    {
        empresaService.getEmpresas().ifPresent(empresas -> model.addAttribute("empresas", empresas));

        return "ajustes/empresa/index";
    }

}
