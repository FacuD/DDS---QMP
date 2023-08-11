package QuintaInteracion.domain.propuestas;

import lombok.Getter;
import java.util.List;

@Getter

public class PropuestasHandler {
    List<Propuesta> propuestas;
    List<Propuesta> propuestasAceptadas;

    public void tomarPropuesta(Propuesta unaPropuesta){
      propuestas.add(unaPropuesta);
    }

    public void aceptarPropuesta(Propuesta unaPropuesta){
      unaPropuesta.execute();
      propuestas.remove(unaPropuesta);
      propuestasAceptadas.add(unaPropuesta);
    }

    public void aceptarTodasLasPropuestas(){
      this.propuestas.stream().forEach(unaPropuesta->aceptarPropuesta(unaPropuesta));
    }

    public void rechazarPropuesta(Propuesta unaPropuesta){
      this.propuestas.remove(unaPropuesta);
    }

    public void rechazarTodasLasPropuestas(){
      this.propuestas.stream().forEach(unaPropuesta->rechazarPropuesta(unaPropuesta));
    }

    public void deshacerPropuesta(Propuesta unaPropuesta){
      unaPropuesta.reverse();
      this.propuestasAceptadas.remove(unaPropuesta);
    }

    public void deshacerTodasLasPropuestas(){
      this.propuestasAceptadas.stream().forEach(unaPropuestaAceptada->deshacerPropuesta(unaPropuestaAceptada));
    }
}
