package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Estado;
import app.liwru.pollux.svc.repository.EstadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoService implements CrudService<Estado, Integer> {

    private final EstadoRepository estadoRepository;

    public EstadoService(EstadoRepository estadoRepository) {
        this.estadoRepository = estadoRepository;
    }

    @Override
    public void create(Estado estado) {
        estadoRepository.save(estado);
    }

    @Override
    public void update(Estado estado) {
        estadoRepository.save(estado);
    }

    @Override
    public void delete(Integer id) {
        estadoRepository.deleteById(id);
    }

    @Override
    public Estado findById(Integer id) {
        return estadoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Estado> findAll() {
        return estadoRepository.findAll();
    }
}
