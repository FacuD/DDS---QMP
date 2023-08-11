package QuintaInteracion.domain.peticion;

import QuintaInteracion.domain.Guardarropa;
import QuintaInteracion.domain.Prenda;
import QuintaInteracion.domain.propuestas.Propuesta;

public class QuitarPrendaSegunPeticion implements Propuesta {
    Prenda prenda;
    Guardarropa guardarropa;

  public QuitarPrendaSegunPeticion(Guardarropa guardarropa, Prenda prenda) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void execute(){
      guardarropa.quitarPrenda(prenda);
    }
    public void reverse(){
      guardarropa.agregarPrenda(prenda);
    }
}
