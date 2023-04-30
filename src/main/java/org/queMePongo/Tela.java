package org.queMePongo;

public class Tela implements Material {
  private Trama trama;

  Tela(Trama trama){
    if(trama == null){
      this.trama = Trama.LISA;
    }else {
      this.trama = trama;
    }
  }

  @Override
  public TipoMaterial getTipoMaterial() {
    return TipoMaterial.TELA;
  }
}
