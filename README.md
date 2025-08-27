# Projeto: Web Services com Spring Boot, JPA e Hibernate

Este projeto foi desenvolvido com **Java 21** e tem como objetivo o estudo de **web services RESTful** utilizando **Spring Boot** e **JPA/Hibernate**.  
Ele foi inspirado no curso **Java COMPLETO - Nélio Alves (DevSuperior)**, servindo como prática e consolidação dos conceitos apresentados em aula.

---

## 🎯 Objetivos do projeto
- Criar um projeto Spring Boot Java.
- Implementar modelo de domínio (entities).
- Estruturar as camadas lógicas: **resource**, **service**, **repository**.
- Configurar banco de dados de teste (**H2**).
- Popular o banco de dados com dados de exemplo.
- Implementar operações **CRUD** (Create, Retrieve, Update, Delete).
- Realizar tratamento de exceções.

---

## 🏗️ Estrutura do Projeto
- **Entities (Modelo de Domínio)**  
  - `User`  
  - `Order`  
  - `OrderItem`  
  - `Payment`  
  - `Product`  
  - `Category`  
  - `OrderStatus` (enum)

- **Camadas Lógicas**
  - `Resource (Controller)` > Endpoints REST.
  - `Service` > Regras de negócio.
  - `Repository` > Acesso ao banco via Spring Data JPA.

- **Banco de Dados**
  - H2 Database (em memória).
  - Configurado via `application-test.properties`.
  - Populado automaticamente no perfil `test`.

---

## ⚙️ Tecnologias Utilizadas
- **Java 21**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA**
- **H2 Database**
- **Maven**

---

## ▶️ Como executar o projeto
### Pré-requisitos
- Java 21+
- Maven instalado

### Passos
1. Clone o repositório:
   ```bash
   git clone https://github.com/Pedrovizkyh/jpa-springboot.git
   ```
2. Entre na pasta do projeto
   ```bash
   cd jpa-springboot
   ```
3. Execute o projeto:
   ```bash
   mvn spring-boot:run
   ```
4. Acesse o console do H2:
   ```bash
   http://localhost:8080/h2-console
   ```
- JDBC URL: `jdbc:h2:mem:testdb`
- User: `sa`
- Password: (vazio)
  
---

## 📌 Endpoints principais
- **Users**
  - `GET /users` > Lista todos os usuários
  - `GET /users/{id}` > Busca usuário por ID
  - `POST /users` > Insere novo usuário
  - `PUT /users/{id}` > Atualiza usuário existente
  - `DELETE /users/{id}` > Remove usuário
- **Orders, Products, Categories**
  - Também possuem endpoints equivalentes para CRUD.

---

## 📥 Exemplos de Requisições (JSON)
### Criar usuário
`POST /users`
```json
{
  "name": "Bob Brown",
  "email": "bob@gmail.com",
  "phone": "977557755",
  "password": "123456"
}
```
### Atualizar usuário

`PUT /users/1`
```json
{
  "name": "Bob Brown",
  "email": "bob_updated@gmail.com",
  "phone": "977557755"
}
```
### Exemplo de resposta de erro (usuário não encontrado)
```json
{
  "timestamp": "2025-08-25T18:30:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Entity not found",
  "path": "/users/99"
}
```

---

## 🚨 Tratamento de Exceções
- `ResourceNotFoundException` > Quando o objeto não é encontrado.
- `DatabaseException` > Erros relacionados a integridade no banco.
- Respostas seguem um padrão JSON com informações de erro.

---

## 📂 Referência
Este projeto foi inspirado no curso do professor **Nélio Alves (DevSuperior):**
[workshop-springboot2-jpa](https://github.com/acenelio/workshop-springboot2-jpa)

O código deste repositório foi implementado como prática pessoal de estudo.
