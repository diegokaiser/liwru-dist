package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.service.TipoDocumentoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/tipos-documentos")
@RestController
public class TipoDocumentoResource {

    private final TipoDocumentoService tipoDocumentoService;

    public TipoDocumentoResource(TipoDocumentoService tipoDocumentoService) {
        this.tipoDocumentoService = tipoDocumentoService;
    }

    @GetMapping
    public ResponseEntity getTiposDocumentos(){
        return new ResponseEntity<>(tipoDocumentoService.findAll(), HttpStatus.OK);
    }
}
