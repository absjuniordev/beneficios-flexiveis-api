# 🚀 Benefícios Flexíveis API

API em **Spring Boot** para gestão de benefícios flexíveis, pensada para ser **simples no uso**, **clara na organização** e **profissional na arquitetura**.

O foco do projeto é resolver um problema real de negócio sem complicar: permitir que empresas gerenciem colaboradores, benefícios e saldos de forma segura, organizada e preparada para crescer.

---

## 🎯 Qual problema essa API resolve

Gerenciar benefícios como VR, transporte, saúde, gym pass e similares costuma virar bagunça quando o sistema não foi bem pensado.

Essa API resolve isso fazendo o básico **bem-feito**, mas já deixando espaço para evoluções mais robustas:

* Cadastro de empresas
* Cadastro de colaboradores
* Definição de tipos de benefícios
* Carteira individual de benefícios
* Controle de saldo (crédito e débito)
* Relatórios para tomada de decisão

Nada de exagero. Funcional, claro e sustentável.

---

## 🔧 Funcionalidades

### 🔐 Autenticação

* Cadastro e login de usuários
* Autenticação via JWT
* Controle de acesso por contexto

### 🏢 Empresas

* CRUD completo
* Relacionamento com colaboradores

### 👤 Colaboradores

* Cadastro e gerenciamento
* Vínculo com empresa
* Carteira individual de benefícios

### 🎁 Benefícios

* Cadastro de tipos de benefícios
* Regras e limites configuráveis

### 💼 Carteira de Benefícios

* Crédito de saldo
* Débito de saldo
* Auditoria das movimentações

### 📊 Relatórios

* Visão geral por empresa
* Monitoramento de uso dos benefícios

---

## 🧱 Arquitetura e organização do projeto

O projeto segue uma **organização orientada por feature (feature-based / domain-oriented)**.

Isso significa que cada funcionalidade é tratada como um módulo completo, mantendo tudo que pertence ao mesmo domínio **junto e coeso**.

### Estrutura geral

```
com.absjrdev.benefitsapi
│
├── config          # Configurações globais (security, OpenAPI, etc.)
├── common          # Componentes compartilhados (exceptions, utils)
│
├── user            # Feature de usuários
│   ├── api         # Controllers REST
│   ├── application # Serviços / casos de uso
│   ├── domain      # Entidade e regras de negócio
│   ├── dto         # DTOs de entrada e saída
│   └── repository  # Persistência
│
├── benefit         # Feature de benefícios
├── benefitsWallet  # Feature de carteira de benefícios
│
└── BenefitsApiApplication.java
```

### Decisões de design adotadas

* **Organização por feature**, não por camada genérica
* **Domínio isolado**, contendo regras e protegendo estado
* **Services orquestram**, não concentram regra de negócio
* **DTOs apenas transportam dados**, sem lógica
* **Exceções próximas do domínio**, facilitando manutenção
* Estrutura **simples, previsível e escalável**

Esse padrão evita acoplamento desnecessário e facilita crescimento do projeto sem virar bagunça.

---

## 🛠️ Tecnologias utilizadas

* Java 17
* Spring Boot 3
* Spring Security + JWT
* JPA / Hibernate
* PostgreSQL
* Docker / Docker Compose
* Bean Validation
* Swagger / OpenAPI
* JUnit + MockMvc

---

## 📌 Exemplos de endpoints

| Método | Rota                        | Descrição            |
| ------ | --------------------------- | -------------------- |
| POST   | `/auth/register`            | Cria usuário         |
| POST   | `/auth/login`               | Gera token JWT       |
| POST   | `/enterprises`                | Cria empresa         |
| GET    | `/enterprises`                | Lista empresas       |
| POST   | `/employees`                | Cadastra colaborador |
| POST   | `/benefits`                 | Cria benefício       |
| POST   | `/wallets/{employeeId}/add` | Adiciona saldo       |
| GET    | `/reports/enterprises/{id}`     | Relatório geral      |

---

## ▶️ Como rodar o projeto localmente

### Requisitos

* Java 17
* Maven
* Docker
* Docker Compose

### Passos

```bash
git clone https://github.com/seu-usuario/beneficios-flexiveis-api.git
cd beneficios-flexiveis-api

docker-compose up -d

mvn spring-boot:run
```

Swagger UI:

```
http://localhost:8080/swagger-ui.html
```

---

## ✅ Pontos fortes do projeto

* Arquitetura clara e sustentável
* Organização profissional por feature
* JWT implementado corretamente
* Separação real de responsabilidades
* Projeto pronto para evoluir sem retrabalho
* Ambiente reproduzível via Docker

Esse tipo de estrutura é pensada para **projeto real**, não apenas para demonstração.

---

## 🚀 Possíveis evoluções

* Integração com meios de pagamento (sandbox)
* Mensageria assíncrona (Kafka / RabbitMQ)
* Notificações por e-mail ou webhook
* Frontend web (React, Angular ou Vue)
* Observabilidade (metrics, tracing)

---

Projeto construído com foco em clareza, organização e boas práticas de mercado.
