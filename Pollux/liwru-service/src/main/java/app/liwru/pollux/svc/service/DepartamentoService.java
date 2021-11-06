package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Departamento;
import app.liwru.pollux.svc.repository.DepartamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartamentoService implements CrudService<Departamento, Integer> {

    private final DepartamentoRepository departamentoRepository;

    public DepartamentoService(DepartamentoRepository departamentoRepository) {
        this.departamentoRepository = departamentoRepository;
    }

    @Override
    public void create(Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @Override
    public void update(Departamento departamento) {
        departamentoRepository.save(departamento);
    }

    @Override
    public void delete(Integer id) {
        departamentoRepository.deleteById(id);
    }

    @Override
    public Departamento findById(Integer id) {
        return departamentoRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Departamento> findAll() {
        return departamentoRepository.findAll();
    }
}
