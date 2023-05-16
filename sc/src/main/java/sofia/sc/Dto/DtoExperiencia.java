package sofia.sc.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoExperiencia {

    private String nombreE;
    private String descripcionE;

    public DtoExperiencia() {
    }

    public DtoExperiencia(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

}
