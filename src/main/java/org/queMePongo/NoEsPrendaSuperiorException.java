package org.queMePongo;

public class NoEsPrendaSuperiorException extends IllegalArgumentException{
  public NoEsPrendaSuperiorException(String mensaje){
    super(mensaje);
  }
}
