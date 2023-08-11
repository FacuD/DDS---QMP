package QuintaInteracion.domain;

import java.util.List;

public class Guardarropa {
    List<Prenda> prendas;
    TipoCriterio tipoCriterio = null;
    public void agregarPrenda(Prenda unaPrenda){
      prendas.add(unaPrenda);
    }
    public void quitarPrenda(Prenda unaPrenda){
      prendas.remove(unaPrenda);
    }

}
