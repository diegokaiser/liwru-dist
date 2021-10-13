package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.model.Incidencia;
import app.liwru.pollux.svc.service.IncidenciaService;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/incidencias")
@RestController
public class IncidenciaResource {

    private final IncidenciaService incidenciaService;

    public IncidenciaResource(IncidenciaService incidenciaService) {
        this.incidenciaService = incidenciaService;
    }

    @GetMapping
    public ResponseEntity getUsers() {
        return new ResponseEntity<>(incidenciaService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{idIncidencia}")
    public ResponseEntity<Incidencia> getIncidencia(@PathVariable String idIncidencia){
        Incidencia currentIncidencia = incidenciaService.findById(Integer.parseInt(idIncidencia));

        if( idIncidencia == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(currentIncidencia, HttpStatus.OK);
    }

}
