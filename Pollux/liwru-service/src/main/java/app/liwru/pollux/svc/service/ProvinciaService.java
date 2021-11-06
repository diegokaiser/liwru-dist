package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Provincia;
import app.liwru.pollux.svc.repository.ProvinciaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProvinciaService implements CrudService<Provincia, Integer> {

    private final ProvinciaRepository provinciaRepository;

    public ProvinciaService(ProvinciaRepository provinciaRepository) {
        this.provinciaRepository = provinciaRepository;
    }

    @Override
    public void create(Provincia provincia) {
        provinciaRepository.save(provincia);
    }

    @Override
    public void update(Provincia provincia) {
        provinciaRepository.save(provincia);
    }

    @Override
    public void delete(Integer id) {
        provinciaRepository.deleteById(id);
    }

    @Override
    public Provincia findById(Integer id) {
        return provinciaRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Provincia> findAll() {
        return provinciaRepository.findAll();
    }
}
