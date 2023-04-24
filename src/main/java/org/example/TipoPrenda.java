package org.example;

public enum TipoPrenda {
  ANTEOJOS_DE_SOL(CategoriaPrenda.ACCESORIOS),
  REMERA(CategoriaPrenda.PARTE_SUPERIOR),
  PANTALON(CategoriaPrenda.PARTE_INFERIOR),
  PANUELO(CategoriaPrenda.ACCESORIOS),
  JEAN(CategoriaPrenda.PARTE_INFERIOR),
  BOTAS(CategoriaPrenda.CALZADO),
  MUSCULOSA(CategoriaPrenda.PARTE_SUPERIOR),
  POLLERA(CategoriaPrenda.PARTE_INFERIOR),
  CROCS(CategoriaPrenda.PARTE_SUPERIOR),
  ZAPATILLAS(CategoriaPrenda.CALZADO);

  private CategoriaPrenda categoria;

  private TipoPrenda(CategoriaPrenda categoria){
    this.categoria = categoria;
  }

  public CategoriaPrenda getCategoria(){
    return categoria;
  }
  boolean perteneceACategoria(CategoriaPrenda categoria){
    return this.categoria == categoria;
  }
}
