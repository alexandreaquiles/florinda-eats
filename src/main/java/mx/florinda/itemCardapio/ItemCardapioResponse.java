package mx.florinda.itemCardapio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ItemCardapioResponse {

  @JsonProperty
  private final Long id;

  @JsonProperty
  private final String nome;

  @JsonProperty
  private final String descricao;

  @JsonProperty
  private final String categoria;

  @JsonProperty
  private final BigDecimal precoFinal;

  public ItemCardapioResponse(Long id, String nome, String descricao, String categoria, BigDecimal precoFinal) {
    this.id = id;
    this.nome = nome;
    this.descricao = descricao;
    this.categoria = categoria;
    this.precoFinal = precoFinal;
  }

  static ItemCardapioResponse fromEntity(ItemCardapio itemCardapio) {
    return new ItemCardapioResponse(itemCardapio.id, itemCardapio.nome, itemCardapio.descricao, itemCardapio.categoria.name(), itemCardapio.getPrecoFinal());
  }

}
