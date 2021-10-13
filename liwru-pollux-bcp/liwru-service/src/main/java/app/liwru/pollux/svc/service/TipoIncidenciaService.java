package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.TipoIncidencia;
import app.liwru.pollux.svc.repository.TipoIncidenciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoIncidenciaService implements CrudService<TipoIncidencia, Integer> {

    private final TipoIncidenciaRepository tipoIncidenciaRepository;

    public TipoIncidenciaService(TipoIncidenciaRepository tipoIncidenciaRepository) {
        this.tipoIncidenciaRepository = tipoIncidenciaRepository;
    }


    @Override
    public void create(TipoIncidencia tipoIncidencia) {
        tipoIncidenciaRepository.save(tipoIncidencia);
    }

    @Override
    public void update(TipoIncidencia tipoIncidencia) {
        tipoIncidenciaRepository.save(tipoIncidencia);
    }

    @Override
    public void delete(Integer id) {
        tipoIncidenciaRepository.deleteById(id);
    }

    @Override
    public TipoIncidencia findById(Integer id) {
        return tipoIncidenciaRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<TipoIncidencia> findAll() {
        return tipoIncidenciaRepository.findAll();
    }
}
