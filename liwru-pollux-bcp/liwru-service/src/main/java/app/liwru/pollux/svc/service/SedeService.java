package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Sede;
import app.liwru.pollux.svc.repository.SedeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeService implements CrudService<Sede, Integer> {

    private final SedeRepository sedeRepository;

    public SedeService(SedeRepository sedeRepository) {
        this.sedeRepository = sedeRepository;
    }

    @Override
    public void create(Sede sede) {
        sedeRepository.save(sede);
    }

    @Override
    public void update(Sede sede) {
        sedeRepository.save(sede);
    }

    @Override
    public void delete(Integer id) {
        sedeRepository.deleteById(id);
    }

    @Override
    public Sede findById(Integer id) {
        return sedeRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Sede> findAll() {
        return sedeRepository.findAll();
    }
}
