package org.queMePongo;

import java.util.Optional;

public class Prenda {
  private TipoPrenda tipo;
  private Tela tela;
  private Color colorPrincipal;
  private Optional<Color> colorSecundario;

  Prenda(TipoPrenda tipo, CategoriaPrenda categoria, Tela tela, Color color, Optional<Color> colorSecundario) {
    if(!tipo.perteneceACategoria(categoria)){
      throw new TipoNoCoindiceConLaCategoriaException("La categoría no corresponde con el tipo de prenda");
    }
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrincipal = color;
    this.colorSecundario = colorSecundario;
  }

  // Material Constructor


  @Override
  public String toString() {
    String colorSecundarioStr = colorSecundario == null ? "" : ", color secundario: " + colorSecundario;
    return tipo.toString() + " " + colorPrincipal.toString();
  }


  TipoPrenda getTipo(){
    return this.tipo;
  }
}
