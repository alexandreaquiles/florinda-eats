CREATE TABLE ItemCardapio (
    id BIGINT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(1000),
    categoria ENUM('ENTRADAS', 'PRATOS_PRINCIPAIS', 'BEBIDAS', 'SOBREMESA') NOT NULL,
    preco DECIMAL(9, 2) NOT NULL,
    precoPromocional DECIMAL(9, 2)
);

CREATE TABLE ItemCardapio_SEQ (
    next_val BIGINT
);
