# florinda-eats

Para fazer o build de uma imagem Docker com a aplicação:

```sh
quarkus build -Dquarkus.container-image.build=true
```

Deve ser criado uma imagem com o seguinte nome e tag: `alexandre/florinda-eats:1.0.0-SNAPSHOT `

Para executar um BD local e a aplicação utilizando o Docker Compose:

```sh
docker compose up
```

A aplicação terá o limite de 2 CPUs e 512 MB de memória.

Acesse o endpoint com a listagem de itens do cardápio em: http://localhost:8080/itens-cardapio

## Teste de carga básico

UsApache Bench (ab)

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


