package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.ApoderadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/apoderados")
@RestController
public class ApoderadoResource {

    private final ApoderadoService apoderadoService;

    public ApoderadoResource(ApoderadoService apoderadoService) {
        this.apoderadoService = apoderadoService;
    }

    @GetMapping
    public ResponseEntity getApoderados(){
        return new ResponseEntity<>(apoderadoService.findAll(), HttpStatus.OK);
    }
}
