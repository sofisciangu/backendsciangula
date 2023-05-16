package sofia.sc.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sofia.sc.model.Experiencia;
import sofia.sc.model.repository.IExperienciaRepository;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public IExperienciaRepository iexperienciaR;

    @Override
    public List<Experiencia> list() {
        return iexperienciaR.findAll();
    }

    @Override
    public Optional<Experiencia> getOne(Long id) {
        return iexperienciaR.findById(id);
    }

    @Override
    public void save(Experiencia expe) {
        iexperienciaR.save(expe);
    }

    @Override
    public void delete(Long id) {
        iexperienciaR.deleteById(id);
    }

    @Override
    public boolean existsById(Long id) {
        return iexperienciaR.existsById(id);
    }
    
}
