-- PRATOS_PRINCIPAIS
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional) VALUES
(1, 'Sanduíche de Presunto do Chaves', 'Sanduíche de presunto simples, mas feito com muito amor.', 'PRATOS_PRINCIPAIS', 3.50, 2.99);

-- Bebidas
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional) VALUES
(2, 'Refresco do Chaves', 'Suco de limão, que parece de tamarindo, mas tinha gosto de groselha.', 'BEBIDAS', 2.99, NULL);

-- Entradas
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional)
VALUES
(3, 'Tostadas do Seu Madruga', 'Tostadas levemente queimadas e crocantes, estilo Seu Madruga.', 'ENTRADAS', 5.99, NULL),
(4, 'Salada de Pepino da Dona Clotilde', 'Salada fresca de pepino temperada com limão e especiarias.', 'ENTRADAS', 6.99, 5.99);

-- Mais PRATOS_PRINCIPAIS
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional)
VALUES
(5, 'Torta de Frango da Dona Florinda', 'Torta de frango com recheio cremoso e massa crocante.', 'PRATOS_PRINCIPAIS', 12.99, 10.99),
(6, 'Pipoca do Quico', 'Balde de pipoca preparado com carinho pelo Quico.', 'PRATOS_PRINCIPAIS', 4.99, 3.99);

-- Mais Bebidas
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional)
VALUES
(7, 'Água de Jamaica', 'Água aromatizada com hibisco e toque de açúcar.', 'BEBIDAS', 2.50, 2.00),
(8, 'Café da Dona Florinda', 'Café forte para começar o dia com energia.', 'BEBIDAS', 1.99, 1.50);

-- Sobremesas
INSERT INTO ItemCardapio (id, nome, descricao, categoria, preco, precoPromocional)
VALUES
(9, 'Churros do Chaves', 'Churros recheados com doce de leite, clássicos e irresistíveis.', 'SOBREMESA', 4.99, 3.99),
(10, 'Gelatina Colorida do Nhonho', 'Gelatina de várias cores, a sobremesa favorita do Nhonho.', 'SOBREMESA', 3.50, 2.99),
(11, 'Bolo de Chocolate da Dona Clotilde', 'Bolo de chocolate com cobertura de brigadeiro.', 'SOBREMESA', 5.99, 4.99);

INSERT INTO ItemCardapio_SEQ (next_val) VALUES (12);
