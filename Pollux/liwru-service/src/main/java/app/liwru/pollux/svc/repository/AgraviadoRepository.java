package app.liwru.pollux.svc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import app.liwru.pollux.svc.model.Agraviado;
import org.springframework.stereotype.Repository;

@Repository
public interface AgraviadoRepository extends JpaRepository<Agraviado, Integer> {

}
