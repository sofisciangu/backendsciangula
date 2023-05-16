package sofia.sc.service;

import java.util.List;
import sofia.sc.model.Persona;

public interface IPersonaService {

    public List<Persona> verPersonas();

    public void crearPersona(Persona pers);

    public void borrarPersona(Long id);

    public Persona buscarPersona(Long id);
}
