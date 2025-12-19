# 📦 DTOs com `record` no Java (Spring Boot)

Este projeto tem como objetivo demonstrar o uso de **DTOs (Data Transfer Objects)** utilizando **`record` do Java**, destacando sua **relevância**, **vantagens** e **boas práticas** em aplicações **Spring Boot**.

---

## 🚀 O que são DTOs?

DTOs (**Data Transfer Objects**) são objetos usados para **transportar dados entre camadas** da aplicação, principalmente entre:

- Controller ↔ Service
- API ↔ Cliente
- Entity ↔ Response

Eles evitam:
- Expor diretamente entidades JPA
- Acoplamento excessivo
- Problemas de segurança
- Dificuldade de manutenção

---

## 🧠 Por que NÃO usar Entity diretamente?

Usar entidades JPA como entrada ou saída da API pode causar:

❌ Exposição de campos sensíveis  
❌ Dependência direta da estrutura do banco  
❌ Problemas com serialização (`LazyInitializationException`)  
❌ Dificuldade para evoluir a API  

➡️ **DTOs resolvem esses problemas**.

---

## 🆕 O que é `record` no Java?

Introduzido no **Java 16**, o `record` é um tipo especial de classe **imutável**, ideal para representar **dados**.

Exemplo simples:

```java
public record TarefaDTO(String nome, String descricao) {}
```
## ⚠️ Quando NÃO usar record?

- Quando o objeto precisa ser mutável

- Quando há lógica complexa no objeto

- Em entidades JPA (não recomendado)
