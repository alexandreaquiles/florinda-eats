-- tabela Pedido
CREATE TABLE Pedido (
    id BIGINT PRIMARY KEY,
    dataHora DATETIME NOT NULL,
    status ENUM('REALIZADO', 'PAGO', 'CONFIRMADO', 'PRONTO', 'SAIU_PRA_ENTREGA', 'ENTREGUE') NOT NULL,
    nomeCliente VARCHAR(100) NOT NULL,
    cpfCliente VARCHAR(14) NOT NULL,
    celularCliente VARCHAR(16) NOT NULL,
    enderecoCliente VARCHAR(300) NOT NULL
);

CREATE TABLE Pedido_SEQ (
    next_val BIGINT
);

-- tabela ItemPedido
CREATE TABLE ItemPedido (
    id BIGINT PRIMARY KEY,
    quantidade BIGINT NOT NULL,
    precoUnitario DECIMAL(9, 2) NOT NULL,
    observacao VARCHAR(300),
    pedido_id BIGINT NOT NULL,
    itemCardapio_id BIGINT NOT NULL,
    FOREIGN KEY (pedido_id) REFERENCES Pedido(id),
    FOREIGN KEY (itemCardapio_id) REFERENCES ItemCardapio(id)
);

CREATE TABLE ItemPedido_SEQ (
    next_val BIGINT
);
