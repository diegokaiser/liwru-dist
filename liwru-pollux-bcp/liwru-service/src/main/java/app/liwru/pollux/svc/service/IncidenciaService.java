package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Incidencia;
import app.liwru.pollux.svc.repository.IncidenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncidenciaService implements CrudService<Incidencia, Integer> {

    private final IncidenciaRepository incidenciaRepository;

    public IncidenciaService(IncidenciaRepository incidenciaRepository) {
        this.incidenciaRepository = incidenciaRepository;
    }

    @Override
    public void create(Incidencia incidencia) {
        incidenciaRepository.save(incidencia);
    }

    @Override
    public void update(Incidencia incidencia) {
        incidenciaRepository.save(incidencia);
    }

    @Override
    public void delete(Integer id) {
        incidenciaRepository.deleteById(id);
    }

    @Override
    public Incidencia findById(Integer id) {
        return incidenciaRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Incidencia> findAll() {
        return incidenciaRepository.findAll();
    }
}
