package mx.florinda.pedido;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDateTime;

@Entity
public class Pedido extends PanacheEntity {

  public LocalDateTime dataHora;

  @Enumerated(EnumType.STRING)
  public StatusPedido status;

  @Embedded
  public Cliente cliente;

}
