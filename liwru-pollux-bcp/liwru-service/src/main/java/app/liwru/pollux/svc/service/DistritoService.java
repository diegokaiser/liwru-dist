package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Distrito;
import app.liwru.pollux.svc.repository.DistritoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DistritoService implements CrudService<Distrito, Integer> {

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
