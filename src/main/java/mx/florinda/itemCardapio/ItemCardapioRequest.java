package mx.florinda.itemCardapio;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class ItemCardapioRequest {

  @JsonProperty
  private String nome;

  @JsonProperty
  private String descricao;

  @JsonProperty
  private CategoriaCardapio categoria;

  @JsonProperty
  private BigDecimal preco;

  public ItemCardapio toEntity() {
    ItemCardapio itemCardapio = new ItemCardapio();
    itemCardapio.nome = this.nome;
    itemCardapio.descricao = this.descricao;
    itemCardapio.categoria = this.categoria;
    itemCardapio.preco = this.preco;
    return itemCardapio;
  }

}