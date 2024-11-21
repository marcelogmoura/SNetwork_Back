# 📚 SNetwork Test 11/2024
Este projeto tem como objetivo desenvolver uma API RESTful para gerenciamento de produtos proporcionando funcionalidades de CRUD (Create, Read, Update, Delete) e armazenamento dos dados em um banco de dados MongoDb.

## Tecnlogias utilizadas
- Java 17
- Spring Boot
- Maven
- Spring Data
- MongoDB (exigência do teste)
- Model Mapper
- jUnit 5

## Documentação
- Para visualizar a documentação da API, clique no link:

```bash 
http://localhost:8083/swagger-ui/index.html
```

## Funcionalidades

- CRUD para produtos:
Crie, visualize, atualize e exclua produtos com facilidade.
- Armazenamento de dados no MongoDB:
Seus dados são armazenados de forma segura e persistente.

## Como utilizar
- Para ter acesso aos endpoints da API, basta acessar a url do Swagger -> http://localhost:8083/swagger-ui/index.html
```bash
http://localhost:8083/swagger-ui/index.html#/produto-controller/criar

{
  "nome": "string",
  "quantidade": integer,
  "ean": integer,
  "preco": double
}
```

- Para editar um produto, é só preencher com o id da produto depois preencher com os campos de acordo com a necessidade de alteração.

```bash
PUT: http://localhost:8083/swagger-ui/index.html#/produto-controller/editar

{
  "nome": "string",
  "quantidade": integer,
  "ean": integer,
  "preco": double
}
```

- Para buscar uma tarefa pelo id.

```bash
GET: http://localhost:8083/swagger-ui/index.html#/produto-controller/editar

{
  "id": "guid",
  "nome": "string",
  "quantidade": integer,
  "ean": integer,
  "dataCadastro": "local date time",
  "preco": double
}
```

- Para listar todos os produtos, ordenado pela data. Mais antigos primeiro, mais novos ao fim.

```bash
GET: http://localhost:8083/swagger-ui/index.html#/produto-controller/getAll

```

- Para deletar um produto é só enviar um o id como parâmetro
```bash
DELETE: http://localhost:8083/swagger-ui/index.html#/produto-controller/delete

```

## Autor 
- [@mgmoura](https://www.instagram.com/mgmoura/)


**"The world is full of kings and queens who blind your eyes and steal your dreams."**
