package QuintaInteracion.domain.peticion;

import QuintaInteracion.domain.Guardarropa;
import QuintaInteracion.domain.Prenda;
import QuintaInteracion.domain.propuestas.Propuesta;

public class AgregarPrendaSegunPeticion implements Propuesta {
    Prenda prenda;
    Guardarropa guardarropa;

  public AgregarPrendaSegunPeticion(Guardarropa guardarropa, Prenda prenda) {
    this.prenda = prenda;
    this.guardarropa = guardarropa;
  }

  public void execute(){
      guardarropa.agregarPrenda(prenda);
    }
    public void reverse(){
      guardarropa.quitarPrenda(prenda);
    }
}
