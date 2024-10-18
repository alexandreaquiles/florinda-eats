-- Pratos Principais
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional) VALUES
(1, 'Sanduíche de Presunto do Chaves', 'Sanduíche de presunto simples, mas feito com muito amor.', 'PRATOS PRINCIPAIS', 3.50, 2.99);

-- Bebidas
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional) VALUES
(2, 'Refresco do Chaves', 'Suco de limão, que parece de tamarindo, mas tinha gosto de groselha.', 'BEBIDAS', 2.99, NULL);

INSERT INTO ItemCardapio_SEQ (next_val) VALUES (3);
