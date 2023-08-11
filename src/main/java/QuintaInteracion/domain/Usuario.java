package QuintaInteracion.domain;

import QuintaInteracion.domain.peticion.AgregarPrendaSegunPeticion;
import QuintaInteracion.domain.peticion.QuitarPrendaSegunPeticion;
import QuintaInteracion.domain.propuestas.Propuesta;
import QuintaInteracion.domain.propuestas.PropuestasHandler;
import java.util.List;

public class Usuario {
  List<Prenda> prendas;
  List<Guardarropa> guardarropas;
  List<Guardarropa> guardarropasCompartidosConmigo;
  PropuestasHandler manejadorPropuestas;

  public void sugerirAgregarPrendaAGuardarropas(Guardarropa guardarropa,Prenda unaPrenda){
    AgregarPrendaSegunPeticion agregarPrendaPeticion =
        new AgregarPrendaSegunPeticion(guardarropa, unaPrenda);
    manejadorPropuestas.tomarPropuesta(agregarPrendaPeticion);
  }
  public void sugerirQuitarPrendaAGuardarropas(Guardarropa guardarropa,Prenda unaPrenda){
    QuitarPrendaSegunPeticion quitarPrendaPeticion =
        new QuitarPrendaSegunPeticion(guardarropa, unaPrenda);
    manejadorPropuestas.tomarPropuesta(quitarPrendaPeticion);
  }
  public List<Propuesta> verPropuestasDeModificacion(){
    return manejadorPropuestas.getPropuestas();
  }
}
