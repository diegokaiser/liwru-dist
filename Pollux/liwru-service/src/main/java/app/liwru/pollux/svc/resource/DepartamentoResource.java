package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.DepartamentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/departamentos")
@RestController
public class DepartamentoResource {

    private final DepartamentoService departamentoService;

    public DepartamentoResource(DepartamentoService departamentoService) {
        this.departamentoService = departamentoService;
    }

    @GetMapping
    public ResponseEntity getDepartamentos(){
        return new ResponseEntity<>(departamentoService.findAll(), HttpStatus.OK);
    }
}
