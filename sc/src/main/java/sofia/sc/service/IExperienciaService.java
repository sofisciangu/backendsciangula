package sofia.sc.service;

import java.util.List;
import java.util.Optional;
import sofia.sc.model.Experiencia;

public interface IExperienciaService {

    public List<Experiencia> list();

    public Optional<Experiencia> getOne(Long id);

    public void save(Experiencia expe);

    public void delete(Long id);

    public boolean existsById(Long id);
}
