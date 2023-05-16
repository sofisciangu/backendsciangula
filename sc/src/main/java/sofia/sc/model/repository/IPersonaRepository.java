package sofia.sc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sofia.sc.model.Persona;

@Repository
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
  
}
