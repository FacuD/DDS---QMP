package org.queMePongo;

import java.util.ArrayList;
import java.util.List;

public class Atuendo {
  List<Prenda> atuendo;

  Atuendo(Prenda prendaSuperior, Prenda prendaInferior, Prenda calzado){
    if(!prendaSuperior.getTipo().perteneceACategoria(CategoriaPrenda.PARTE_SUPERIOR) ||
        !prendaInferior.getTipo().perteneceACategoria(CategoriaPrenda.PARTE_INFERIOR) ||
        !calzado.getTipo().perteneceACategoria(CategoriaPrenda.CALZADO)){
      throw new NoEsPrendaSuperiorException("Se debe cargar una prenda superior, una inferior y un calzado para ser un atuendo valido");
    }
    this.atuendo = new ArrayList<>(List.of(prendaSuperior, prendaInferior, calzado));
  }

  @Override
  public String toString() {
    return "Atuendo{" +
        "prendaSuperior=" + atuendo.get(0) +
        ", prendaInferior=" + atuendo.get(1) +
        ", calzado=" + atuendo.get(2) +
        '}';
  }

}
