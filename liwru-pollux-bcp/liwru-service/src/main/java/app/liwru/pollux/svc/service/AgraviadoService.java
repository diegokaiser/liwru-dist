package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.repository.AgraviadoRepository;
import org.springframework.stereotype.Service;
import app.liwru.pollux.svc.model.Agraviado;

import java.util.List;

@Service
public class AgraviadoService implements CrudService<Agraviado, Integer> {

    private final AgraviadoRepository agraviadoRepository;

    public AgraviadoService(AgraviadoRepository agraviadoRepository) {
        this.agraviadoRepository = agraviadoRepository;
    }

    @Override
    public void create(Agraviado agraviado) {
        agraviadoRepository.save(agraviado);
    }

    @Override
    public void update(Agraviado agraviado) {
        agraviadoRepository.save(agraviado);
    }

    @Override
    public void delete(Integer id) {
        agraviadoRepository.deleteById(id);
    }

    @Override
    public Agraviado findById(Integer id) {
        return agraviadoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Agraviado> findAll() {
        return agraviadoRepository.findAll();
    }
}
