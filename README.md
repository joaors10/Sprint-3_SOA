# 💹 X-Profit

Sistema de gerenciamento de **Clientes** e **Investimentos**, desenvolvido em **Spring Boot**.  
O projeto expõe serviços REST que permitem cadastrar, atualizar, consultar e excluir tanto clientes quanto seus investimentos.

---

## 👥 Integrantes do grupo

- Allan Von Ivanov — RM 98705  
- João Rodrigo — RM 551319  
- Bianca Carvalho Dancs Firsoff — RM 551645  
- Giuliano Romaneto Marques — RM 99694  
- Arthur Candido de Abreu — RM 98283  

---

## 📌 Descrição do Projeto

O objetivo do sistema é oferecer um **CRUD completo** para duas entidades principais:

- **Cliente** → nome, e-mail, CPF, saldo.  
- **Investimento** → tipo, valor e vínculo com um cliente.  

Cada cliente pode possuir vários investimentos, garantindo um relacionamento **1:N**.

---

## ⚙️ Passos de Configuração e Execução

### 🔹 Pré-requisitos
- **Java 17+**  
- **Maven 3.8+**  
- **Banco H2** (embutido) ou outro configurado em `application.properties`  

### 🔹 Como executar

```bash
# Clonar o repositório
git clone https://github.com/joaors10/Sprint-3_SOA

# Entrar no diretório
cd x-profit

# Compilar o projeto
mvn clean install

# Executar a aplicação
mvn spring-boot:run

A aplicação ficará disponível em:
👉 http://localhost:8080

## 📬 Endpoints Principais

- **Clientes**
  - `POST /clientes` → Criar cliente
  - `GET /clientes` → Listar clientes
  - `GET /clientes/{id}` → Buscar cliente por ID
  - `PUT /clientes/{id}` → Atualizar cliente
  - `DELETE /clientes/{id}` → Remover cliente

- **Investimentos**
  - `POST /investimentos` → Criar investimento
  - `GET /investimentos` → Listar investimentos
  - `GET /investimentos/{id}` → Buscar investimento por ID
  - `PUT /investimentos/{id}` → Atualizar investimento
  - `DELETE /investimentos/{id}` → Remover investimento

Os exemplos completos de requisições e respostas para **Clientes** e **Investimentos** estão disponíveis no arquivo:

➡️ `docs/requests.md`

Basta acessar a pasta `docs/` dentro do projeto para visualizar.
