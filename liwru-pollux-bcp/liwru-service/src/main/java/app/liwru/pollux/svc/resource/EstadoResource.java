package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.EstadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/estados")
@RestController
public class EstadoResource {

    private final EstadoService estadoService;

    public EstadoResource(EstadoService estadoService) {
        this.estadoService = estadoService;
    }

    @GetMapping
    public ResponseEntity getEstados() {
        return new ResponseEntity<>(estadoService.findAll(), HttpStatus.OK);
    }
}
