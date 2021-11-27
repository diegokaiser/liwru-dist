package app.liwru.pollux.svc.repository;

import app.liwru.pollux.svc.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.liwru.pollux.svc.model.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
     List<Usuario> findByIdRolUsuario(Integer id);

}
