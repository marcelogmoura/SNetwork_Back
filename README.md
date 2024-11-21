# 📚 SNetwork Test 11/2024

Este projeto consiste no desenvolvimento de uma API RESTful para **gerenciamento de produtos**, oferecendo funcionalidades completas de **CRUD** (_Create, Read, Update, Delete_) com armazenamento de dados em um banco de dados **MongoDB**.

## ✨ Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Maven**
- **Spring Data MongoDB**
- **ModelMapper**
- **JUnit 5**

 ## 🗂️ Tabela de Conteúdo

1. [Documentação](#-documentação)
2. [Funcionalidades](#-funcionalidades)
3. [Como Utilizar](#-como-utilizar)
   - [Criar um Produto](#criar-um-produto)
   - [Editar um Produto](#editar-um-produto)
   - [Buscar um Produto pelo ID](#buscar-um-produto-pelo-id)
   - [Listar Todos os Produtos](#listar-todos-os-produtos)
   - [Localizar Produto pelo EAN](#localizar-produto-pelo-ean)
   - [Deletar um Produto](#deletar-um-produto)
4. [Configuração do Ambiente](#-configuração-do-ambiente)
5. [Autor](#-autor)

## 📄 Documentação

A API está documentada utilizando **Swagger UI**. Acesse a interface gráfica para explorar os endpoints:  
[Swagger UI - Documentação da API](http://localhost:8083/swagger-ui/index.html)

## ⚙️ Funcionalidades

1. **CRUD de Produtos**
   - Criar, visualizar, editar e excluir produtos.
2. **Persistência com MongoDB**
   - Todos os dados são armazenados de forma segura e escalável.
3. **Busca Avançada**
   - Pesquisa por **ID** ou **EAN**.
4. **Ordenação**
   - Listagem dos produtos por data de cadastro (mais antigos primeiro).

## Como utilizar

## 🚀 Como Utilizar

### Criar um Produto

```bash
POST: http://localhost:8083/swagger-ui/index.html#/produto-controller/criar

Exemplo de corpo da requisição: 
{
  "nome": "Caderno",
  "quantidade": 10,
  "ean": 7891234567890,
  "preco": 12.99
}
```

### Editar um Produto
- Para editar um produto, é só preencher com o id da produto depois preencher com os campos de acordo com a necessidade de alteração.

```bash
PUT: http://localhost:8083/swagger-ui/index.html#/produto-controller/editar

exemplo de corpo da requisição:

{
  "id": "643f4d2d5b7a451a8c9b",
  "nome": "Caderno Espiral",
  "quantidade": 15,
  "preco": 13.50
}

```

### Para buscar uma tarefa pelo id.

```bash
GET: http://localhost:8083/swagger-ui/index.html#/produto-controller/editar

exemplo de corpo da requisição:
 
{
  "id": "643f4d2d5b7a451a8c9b",
  "nome": "Caderno Espiral",
  "quantidade": 15,
  "ean": 7891234567890,
  "dataCadastro": "2024-11-20T15:30:00",
  "preco": 13.50
}
 
```

### Listar todos os produtos

- Para listar todos os produtos, ordenado pela data. Mais antigos primeiro, mais novos ao fim.

```bash
GET: http://localhost:8083/swagger-ui/index.html#/produto-controller/getAll

```
### Localizar produto pelo EAN

- Para localizar um produto pelo EAN só enviar um o EAN como parâmetro
```bash
GET: http://localhost:8083/swagger-ui/index.html#/produto-controller/getByEan

```

### Deletar um produto

- Para deletar um produto é só enviar um o id como parâmetro
```bash
DELETE: http://localhost:8083/swagger-ui/index.html#/produto-controller/delete

```

🛠️ Configuração do Ambiente
1 - Instale o Java 17 e configure o JAVA_HOME.
2 - Instale o MongoDB e certifique-se de que está em execução na porta padrão (27017).
3 - Clone este repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

4 - Navegue até a pasta do projeto
cd seu-repositorio

5 - Execute o projeto
./mvnw spring-boot:run

## ✍️ Autor 
- [@mgmoura](https://www.instagram.com/mgmoura/)


**"The world is full of kings and queens who blind your eyes and steal your dreams."**

----

Se precisar de mais ajustes ou algo específico, é só avisar! 😊

