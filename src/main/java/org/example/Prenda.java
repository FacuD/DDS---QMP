package org.example;

public class Prenda {
  private TipoPrenda tipo;
  String tela;
  String colorPrincipal;
  String colorSecundario;

  Prenda(TipoPrenda tipo, CategoriaPrenda categoria, String tela, String colorPrincipal) {
    if(!tipo.perteneceACategoria(categoria)){
      throw new TipoNoCoindiceConLaCategoriaException("La categoría no corresponde con el tipo de prenda");
    }
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrincipal = colorPrincipal;
  }

  // Nuevo constructor para que se le pueda pasar el parametro colorSecundario
  Prenda(TipoPrenda tipo, CategoriaPrenda categoria, String tela, String colorPrincipal, String colorSecundario) {
    if(!tipo.perteneceACategoria(categoria)){
      throw new TipoNoCoindiceConLaCategoriaException("La categoría no corresponde con el tipo de prenda");
    }
    this.tipo = tipo;
    this.tela = tela;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  @Override
  public String toString() {
    String colorSecundarioStr = colorSecundario == null ? "" : ", color secundario: " + colorSecundario;
    return tipo.toString() + " " + colorPrincipal.toString();
  }


  TipoPrenda getTipo(){
    return this.tipo;
  }
}
