package mx.florinda.pedido;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Cliente {

  @Column(name = "nomeCliente")
  public String nome;

  @Column(name = "cpfCliente")
  public String cpf;

  @Column(name = "celularCliente")
  public String celular;

  @Column(name = "enderecoCliente")
  public String endereco;

}
