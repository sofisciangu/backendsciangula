package sofia.sc.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sofia.sc.model.Experiencia;

@Repository
public interface IExperienciaRepository extends JpaRepository <Experiencia, Long> {

}
