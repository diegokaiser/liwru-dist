package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Apoderado;
import app.liwru.pollux.svc.repository.ApoderadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApoderadoService implements CrudService<Apoderado, Integer> {

    private ApoderadoRepository apoderadoRepository;

    public ApoderadoService(ApoderadoRepository apoderadoRepository) {
        this.apoderadoRepository = apoderadoRepository;
    }

    @Override
    public void create(Apoderado apoderado) {
        apoderadoRepository.save(apoderado);
    }

    @Override
    public void update(Apoderado apoderado) {
        apoderadoRepository.save(apoderado);
    }

    @Override
    public void delete(Integer id) {
        apoderadoRepository.deleteById(id);
    }

    @Override
    public Apoderado findById(Integer id) {
        return apoderadoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Apoderado> findAll() {
        return apoderadoRepository.findAll();
    }
}
