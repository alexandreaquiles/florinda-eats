# florinda-eats

Para fazer o build de uma imagem Docker com a aplicação:

```sh
quarkus build -Dquarkus.container-image.build=true -Dquarkus.container-image.tag=reativo
```

Deve ser criada uma imagem com o seguinte nome e tag: `alexandre/florinda-eats:reativo`

Caso a versão Reativa do client MySQL e Panache não seja usada, defina a tag como `imperativo`.

Para executar um BD local MySQL 8 e a aplicação, utilize o Docker Compose:

```sh
docker compose up
```

A aplicação terá o limite de 2 CPUs e o BD de 1 CPU. Tanto a aplicação como o BD terão 512 MB de memória.

Acesse o endpoint com a listagem de itens do cardápio em: http://localhost:8080/itens-cardapio

## Teste de carga básico

Vamos utilizar o Apache Bench (ab) para um teste de carga bem básico. Instalação:

- Ubuntu/Debian: `sudo apt-get install apache2-utils`
- CentOS/RHEL: `sudo yum install httpd-tools`
- MacOS: `brew install httpd`
- Windows: use Windows Subsystem for Linux (WSL)

Efetue um teste de carga simples com o ab:

```sh
ab -n 1000 -c 50 http://localhost:8080/itens-cardapio
```

Opções:

- `-n`: número total de requests
- `-c`: número de requests concorrentes, feitos simultaneamente


