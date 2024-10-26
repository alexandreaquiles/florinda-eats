package mx.florinda.pedido;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import mx.florinda.itemCardapio.ItemCardapio;

import java.math.BigDecimal;

@Entity
public class ItemPedido extends PanacheEntity {

  public Long quantidade;
  public BigDecimal precoUnitario;
  public String observacao;

  @ManyToOne
  public Pedido pedido;

  @ManyToOne
  public ItemCardapio itemCardapio;

}
