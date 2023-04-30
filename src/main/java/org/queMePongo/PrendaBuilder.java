package org.queMePongo;

import java.util.List;
import java.util.Optional;

public class PrendaBuilder {
  private TipoPrenda tipo;
  private Tela tela;
  private Color color;
  private Color colorSecundario;

  public PrendaBuilder cargarTipoPrenda(TipoPrenda tipo){
    this.tipo = tipo;
    return this;
  }

  public PrendaBuilder cargarTela(Tela tela){
    this.tela = tela;
    return this;
  }

  public PrendaBuilder cargarColorPrincipal(Color color){
    this.color = color;
    return this;
  }

  public PrendaBuilder cargarColorSecundario(Color color){
    this.colorSecundario = color;
    return this;
  }

  // Crear una prenda especificando en segundo lugar los aspectos relacionados a su material
  public Prenda buildTipoyMateriales(TipoPrenda tipo, List<Material> materiales){
    Tela tela = (Tela) materiales.stream().filter(t -> t.getTipoMaterial() == TipoMaterial.TELA).findFirst().orElse(null);
    Color color = (Color) materiales.stream().filter(m -> m.getTipoMaterial() == TipoMaterial.COLOR_PRINCIPAL).findFirst().orElse(null);
    Color colorSecundario = (Color) materiales.stream().filter(m -> m.getTipoMaterial() == TipoMaterial.COLOR_SECUNDARIO).findFirst().orElse(null);
    return new Prenda(tipo, tipo.getCategoria(), tela, color, Optional.ofNullable(colorSecundario));
    }
  }
