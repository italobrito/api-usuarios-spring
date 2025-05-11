# 🌐 Microserviço: API de Usuários

Este projeto é um microserviço desenvolvido em **Spring Boot** para gerenciar usuários. Ele fornece uma API RESTful para operações de CRUD (Criar, Ler, Atualizar e Deletar) de usuários, incluindo informações pessoais, endereço e informações profissionais.

## 🛠️ Tecnologias Utilizadas

- ⚙️ **Java 21**
- 🌱 **Spring Boot 3.4.5**
- ⚙️ **Arquitetura de Port and Adapters**
- 🗄️ **Spring Data JPA**
- 🛢️ **H2 Database** (banco de dados em memória para testes)
- 🐘 **PostgreSQL** (banco de dados em produção)
- 🔄 **MapStruct** (para mapeamento de objetos)
- ✂️ **Lombok** (para reduzir boilerplate de código)
- 📜 **SpringDoc OpenAPI** (para documentação da API)
- 🔒 **JWT** (para autenticação e autorização)

## 📂 Estrutura do Projeto

- **`src/main/java`**: Código-fonte principal.
  - 📦 **`domain/entities`**: Entidades do domínio, como `Usuario`, `Endereco`, `InformacoesPessoais` e `InformacoesProfissionais`.
  - 📥 **`adapters/in`**: Controladores REST e classes de resposta.
  - 📥 **`adapters/out`**: Controladores REST e classes de resposta.
  - 🧠 **`application/usecase`**: Casos de uso que implementam a lógica de negócios.
  - 🔄 **`application/mappers`**: Mapeadores para conversão entre entidades e DTOs.
  - 📤 **`ports/in`**: Interfaces para entrada (controladores e casos de uso).
  - 📤 **`ports/out`**: Interfaces para saída (repositórios).
- **`src/test/java`**: Testes unitários e de integração.
- **`src/main/resources`**: Arquivos de configuração, como `application.properties`.

## 🚀 Endpoints da API

### 🧑‍💻 Usuários

- **POST `/usuarios`**: Cadastrar um novo usuário.
- **GET `/usuarios`**: Buscar todos os usuários.
- **GET `/usuarios/{id}`**: Buscar um usuário por ID.
- **PUT `/usuarios/{id}`**: Atualizar um usuário existente.
- **DELETE `/usuarios/{id}`**: Deletar um usuário.

### 📋 Exemplo de Requisição

#### Cadastro de Usuário

```json
POST /usuarios
Content-Type: application/json

{
  "informacoesPessoais": {
    "nomeCompleto": "João Silva",
    "genero": "M",
    "email": "joao.silva@example.com",
    "telefone": "(11) 98765-4321",
    "dataNascimento": "1990-01-01",
    "cpf": "123.456.789-00",
    "rg": "12.345.678-9"
  },
  "endereco": {
    "rua": "Rua das Flores",
    "numero": "123",
    "complemento": "Apto 101",
    "bairro": "Centro",
    "cidade": "São Paulo",
    "estado": "SP",
    "cep": "01000-000"
  },
  "informacoesProfissionais": {
    "tipoUsuario": "Admin",
    "status": "Ativo",
    "cargo": "Gerente",
    "dataAdmissao": "2020-01-01",
    "setor": "TI",
    "temaPreferido": "Tecnologia"
  },
  "avatar": "url-do-avatar"
}

```
