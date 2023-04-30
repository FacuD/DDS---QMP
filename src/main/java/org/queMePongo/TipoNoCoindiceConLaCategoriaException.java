package org.queMePongo;

public class TipoNoCoindiceConLaCategoriaException extends IllegalArgumentException{
  public TipoNoCoindiceConLaCategoriaException(String mensaje){
    super(mensaje);
  }
}
