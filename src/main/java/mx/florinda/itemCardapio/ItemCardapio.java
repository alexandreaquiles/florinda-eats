package mx.florinda.itemCardapio;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemCardapio extends PanacheEntity {

  public String nome;
  public String descricao;

  @Enumerated(EnumType.STRING)
  public CategoriaCardapio categoria;

  public BigDecimal preco;
  public BigDecimal precoPromocional;

}
