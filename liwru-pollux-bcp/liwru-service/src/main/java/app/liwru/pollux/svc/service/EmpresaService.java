package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Empresa;
import app.liwru.pollux.svc.repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService implements CrudService<Empresa, Integer> {

    private final EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public void create(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void update(Empresa empresa) {
        empresaRepository.save(empresa);
    }

    @Override
    public void delete(Integer id) {
        empresaRepository.deleteById(id);
    }

    @Override
    public Empresa findById(Integer id) {
        return empresaRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }
}
