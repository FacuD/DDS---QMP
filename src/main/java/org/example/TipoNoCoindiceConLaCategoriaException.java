package org.example;

public class TipoNoCoindiceConLaCategoriaException extends IllegalArgumentException{
  public TipoNoCoindiceConLaCategoriaException(String mensaje){
    super(mensaje);
  }
}
