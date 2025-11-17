# 🚀 Benefícios Flexíveis API

API em **Spring Boot** pra gerenciar benefícios flexíveis de forma simples e profissional.
A ideia é permitir que empresas cadastrem colaboradores, definam benefícios e controlem saldos sem dor de cabeça — tudo organizado, seguro e fácil de escalar.

---

## 🎯 O que essa API resolve

Empresas precisam gerenciar benefícios tipo VR, transporte, saúde, gym e etc.
Normalmente isso vira bagunça. Aqui não.

A API faz o básico bem-feito e já abre espaço pra coisas mais avançadas depois:

* Cadastro de empresas
* Cadastro de colaboradores
* Tipos de benefícios
* Carteira individual com saldo
* Movimentações (crédito e débito)
* Relatórios pra tomada de decisão

Simples, direto, funcional.

---

## 🔧 O que já tem (ou vai ter rapidinho)

### **Autenticação**

* Cadastro e login
* Token JWT pra garantir acesso seguro

### **Empresas**

* CRUD completo
* Cada empresa com seus colaboradores

### **Colaboradores**

* CRUD e vínculo com a empresa
* Carteira de benefícios individual

### **Benefícios**

* Cadastro dos tipos
* Regras e limites configuráveis

### **Carteira**

* Adicionar saldo
* Consumir saldo
* Auditoria das operações

### **Relatórios**

* Resumo por empresa
* Monitoramento do uso dos benefícios

---

## 🧱 Como o projeto é organizado

Arquitetura limpa, nada de gambiarra:

```
controller/
service/
repository/
dto/
entity/
config/
security/
```

### Tecnologias

* Spring Boot 3
* Spring Security + JWT
* JPA / Hibernate
* PostgreSQL
* Docker
* Bean Validation
* Swagger/OpenAPI
* JUnit + MockMvc

---

## 📌 Exemplos de Endpoints

| Método | Rota                        | O que faz            |
| ------ | --------------------------- | -------------------- |
| POST   | `/auth/register`            | Cria usuário         |
| POST   | `/auth/login`               | Gera JWT             |
| POST   | `/companies`                | Cria empresa         |
| GET    | `/companies`                | Lista empresas       |
| POST   | `/employees`                | Cadastra colaborador |
| POST   | `/benefits`                 | Cria benefício       |
| POST   | `/wallets/{employeeId}/add` | Adiciona saldo       |
| GET    | `/reports/company/{id}`     | Relatório geral      |

---

## ▶️ Como rodar isso local

### Requisitos

* Java 17
* Maven
* Docker
* PostgreSQL (ou só usar o Docker Compose mesmo)

### Passo a passo

```bash
git clone https://github.com/seu-usuario/beneficios-flexiveis-api.git
cd beneficios-flexiveis-api

docker-compose up -d

mvn spring-boot:run
```

Swagger:

```
http://localhost:8080/swagger-ui.html
```

---

## 🎯 Pontos fortes do projeto

* JWT funcionando do jeito certo
* Logs e auditoria pra dar segurança
* Camadas bem separadas (controller, service, repo…)
* Testes automatizados
* Documentação clara
* Banco preparado via Docker

Esse combo é o que faz recrutador olhar teu repo e pensar: “ok, esse dev sabe o que está fazendo”.

---

## 🚀 Ideias pra evoluir

* Pagamentos simulados (PIX fake / Stripe sandbox)
* Painel web (React, Angular ou Vue)
* Eventos assíncronos com Kafka/RabbitMQ
* Webhooks ou notificações por e-mail

---
  
