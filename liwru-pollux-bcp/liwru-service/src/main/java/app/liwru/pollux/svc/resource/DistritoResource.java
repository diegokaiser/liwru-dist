package app.liwru.pollux.svc.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/distritos")
@RestController
public class DistritoResource {

    private final AgraviadoResource.DistritoService distritoService;

    public DistritoResource(AgraviadoResource.DistritoService distritoService) {
        this.distritoService = distritoService;
    }

    @GetMapping
    public ResponseEntity getDistritos(){
        return new ResponseEntity<>(distritoService.findAll(), HttpStatus.OK);
    }
}
