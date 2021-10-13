package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.TipoIncidenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/tipos-incidencias")
@RestController
public class TipoIncidenciaResource {

    private final TipoIncidenciaService tipoIncidenciaService;

    public TipoIncidenciaResource(TipoIncidenciaService tipoIncidenciaService) {
        this.tipoIncidenciaService = tipoIncidenciaService;
    }

    @GetMapping
    public ResponseEntity getTiposIncidencias(){
        return new ResponseEntity<>(tipoIncidenciaService.findAll(), HttpStatus.OK);
    }
}
