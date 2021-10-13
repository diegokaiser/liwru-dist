package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Motivo;
import app.liwru.pollux.svc.repository.MotivoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotivoService implements CrudService<Motivo, Integer> {

    private final MotivoRepository motivoRepository;

    public MotivoService(MotivoRepository motivoRepository) {
        this.motivoRepository = motivoRepository;
    }

    @Override
    public void create(Motivo motivo) {
        motivoRepository.save(motivo);
    }

    @Override
    public void update(Motivo motivo) {
        motivoRepository.save(motivo);
    }

    @Override
    public void delete(Integer id) {
        motivoRepository.deleteById(id);
    }

    @Override
    public Motivo findById(Integer id) {
        return motivoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Motivo> findAll() {
        return motivoRepository.findAll();
    }
}
