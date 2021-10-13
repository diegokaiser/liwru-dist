package app.liwru.pollux.svc.resource;

import app.liwru.pollux.svc.model.Distrito;
import app.liwru.pollux.svc.repository.DistritoRepository;
import app.liwru.pollux.svc.service.AgraviadoService;
import app.liwru.pollux.svc.service.CrudService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/agraviados")
@RestController
public class AgraviadoResource {

    private final AgraviadoService agraviadoService;

    public AgraviadoResource(AgraviadoService agraviadoService) {
        this.agraviadoService = agraviadoService;
    }

    @GetMapping
    public ResponseEntity getAgraviados() {
        return new ResponseEntity<>(agraviadoService.findAll(), HttpStatus.OK);
    }

    @Service
    public static class DistritoService implements CrudService<Distrito, Integer> {

        private final DistritoRepository distritoRepository;

        public DistritoService(DistritoRepository distritoRepository) {
            this.distritoRepository = distritoRepository;
        }

        @Override
        public void create(Distrito distrito) {
            distritoRepository.save(distrito);
        }

        @Override
        public void update(Distrito distrito) {
            distritoRepository.save(distrito);
        }

        @Override
        public void delete(Integer id) {
            distritoRepository.deleteById(id);
        }

        @Override
        public Distrito findById(Integer id) {
            return distritoRepository.findById(id)
                    .orElse(null);
        }

        @Override
        public List<Distrito> findAll() {
            return distritoRepository.findAll();
        }
    }
}
