package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.ProvinciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/provincias")
@RestController
public class ProvinciaResource {

    private final ProvinciaService provinciaService;

    public ProvinciaResource(ProvinciaService provinciaService) {
        this.provinciaService = provinciaService;
    }

    @GetMapping
    public ResponseEntity getProvincias(){
        return new ResponseEntity<>(provinciaService.findAll(), HttpStatus.OK);
    }
}
