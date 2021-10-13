package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.MotivoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/motivos")
@RestController
public class MotivoResource {

    private final MotivoService motivoService;

    public MotivoResource(MotivoService motivoService) {
        this.motivoService = motivoService;
    }

    @GetMapping
    public ResponseEntity getMotivos(){
        return new ResponseEntity<>(motivoService.findAll(), HttpStatus.OK);
    }
}
