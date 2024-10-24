package mx.florinda.itemCardapio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCardapioPorCategoriaResponse {

  @JsonProperty
  private final CategoriaCardapio categoria;

  @JsonProperty
  private final Long quantidade;

  public ItemCardapioPorCategoriaResponse(CategoriaCardapio categoria, Long quantidade) {
    this.categoria = categoria;
    this.quantidade = quantidade;
  }

}
