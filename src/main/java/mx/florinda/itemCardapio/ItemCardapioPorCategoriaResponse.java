package mx.florinda.itemCardapio;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemCardapioPorCategoriaResponse {

  @JsonProperty
  private final CategoriaCardapio categoriaCardapio;

  @JsonProperty
  private final Long quantidade;

  public ItemCardapioPorCategoriaResponse(CategoriaCardapio categoriaCardapio, Long quantidade) {
    this.categoriaCardapio = categoriaCardapio;
    this.quantidade = quantidade;
  }
}
