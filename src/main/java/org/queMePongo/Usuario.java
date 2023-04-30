package org.queMePongo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  List<Atuendo> atuendos;
  List<Prenda> listaPrendas;

  Usuario(){
    this.atuendos = new ArrayList<>();
    this.listaPrendas = new ArrayList<>();
  }

  void cargarPrenda(Prenda prenda){
    this.listaPrendas.add(prenda);
  }
}
