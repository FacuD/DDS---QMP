package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
