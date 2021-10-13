package app.liwru.pollux.svc.service;

import app.liwru.pollux.svc.model.Rol;
import app.liwru.pollux.svc.repository.RolRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService implements CrudService<Rol, Integer> {

    private final RolRepository rolRepository;

    public RolService(RolRepository rolRepository) {
        this.rolRepository = rolRepository;
    }

    @Override
    public void create(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void update(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }
}
