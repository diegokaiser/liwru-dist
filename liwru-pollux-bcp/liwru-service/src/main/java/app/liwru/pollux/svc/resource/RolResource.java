package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.RolService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/roles")
@RestController
public class RolResource {

    private final RolService rolService;

    public RolResource(RolService rolService) {
        this.rolService = rolService;
    }

    @GetMapping
    public ResponseEntity getRoles(){
        return new ResponseEntity<>(rolService.findAll(), HttpStatus.OK);
    }
}
