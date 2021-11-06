package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.SedeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/sedes")
@RestController
public class SedeResource {

    private final SedeService sedeService;

    public SedeResource(SedeService sedeService) {
        this.sedeService = sedeService;
    }

    @GetMapping
    public ResponseEntity getSedes(){
        return new ResponseEntity<>(sedeService.findAll(), HttpStatus.OK);
    }
}
