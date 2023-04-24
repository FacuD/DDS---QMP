package org.example;

public class Main {
  public static void main(String[] args) {
    // Crear algunas prendas
    Prenda remera = new Prenda(TipoPrenda.REMERA, CategoriaPrenda.PARTE_SUPERIOR, "algodon", "blanco");
    Prenda pantalon = new Prenda(TipoPrenda.PANTALON, CategoriaPrenda.PARTE_INFERIOR, "jean", "azul");
    Prenda zapatillas = new Prenda(TipoPrenda.ZAPATILLAS, CategoriaPrenda.CALZADO, "cuero", "negro");

    // Crear un atuendo
    Atuendo atuendo1 = new Atuendo(remera, pantalon, zapatillas);

    // Crear un usuario y cargar las prendas
    Usuario usuario1 = new Usuario();
    usuario1.cargarPrenda(remera);
    usuario1.cargarPrenda(pantalon);
    usuario1.cargarPrenda(zapatillas);

    // Agregar el atuendo a la lista de atuendos del usuario
    usuario1.atuendos.add(atuendo1);

    // Imprimir los atuendos del usuario
    System.out.println("Atuendos del usuario:");
    for (Atuendo atuendo : usuario1.atuendos) {
      System.out.println(atuendo.toString());
    }
  }
}
