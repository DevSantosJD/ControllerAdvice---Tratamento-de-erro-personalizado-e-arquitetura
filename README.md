# Atualização do Projeto – Tratamento de Exceções

## 📌 Visão Geral

Esta nova versão do projeto tem como principal demonstração a **evolução do tratamento de exceções**, com foco em padronização, reutilização e clareza na comunicação de erros via API.

O objetivo é apresentar uma arquitetura limpa para **exceções personalizadas**, utilizando:

* Hierarquia de exceções de negócio
* Padronização de erros com `enum`
* DTO para resposta de erro
* Handler global centralizado

---

## 🎯 Principais Melhorias da Atualização

* Criação de um **pacote exclusivo para exceções**
* Implementação de uma **exceção base de negócio** (`RuntimeException`)
* Padronização dos tipos de erro usando `enum`
* Retorno de erros estruturados no formato **DTO**
* Centralização do tratamento de erros com `@ControllerAdvice`

---

## 📂 Estrutura do Pacote de Exceções

```
exception
 ├── ApiError.java
 ├── ErrorType.java
 ├── BusinessException.java
 ├── GlobalExceptionHandler.java
 ├── TarefaNaoEncontradaException.java
```

exception
├── ApiError.java
├── ErrorType.java
├── GlobalExceptionHandler.java
├── TarefaNaoEncontradaException.java

````

---

## 🧩 Descrição dos Componentes

### 🔹 `BusinessException`

Classe base para **exceções de negócio**, estendendo `RuntimeException`.

Responsabilidades:
- Centralizar comportamentos comuns das exceções de domínio
- Garantir consistência no tratamento de regras de negócio
- Facilitar a criação de novas exceções específicas

Benefícios:
- Redução de código duplicado
- Melhor organização da hierarquia de exceções
- Maior clareza semântica no domínio da aplicação

---



### 🔹 `ApiError`

DTO responsável por representar o erro retornado pela API.

Responsabilidades:
- Padronizar a resposta de erro
- Facilitar o consumo pelo cliente (frontend ou outras APIs)

Campos comuns:
- `status`
- `error`
- `message`
- `timestamp`

---

### 🔹 `ErrorType`

Enum utilizado para **padronizar os tipos de erro** da aplicação.

Benefícios:
- Evita mensagens de erro duplicadas
- Centraliza códigos e descrições
- Facilita manutenção e escalabilidade

Exemplos de uso:
- TAREFA_NAO_ENCONTRADA
- ERRO_DE_NEGOCIO
- ERRO_INTERNO

---

### 🔹 `TarefaNaoEncontradaException`

Exceção específica de negócio lançada quando uma tarefa não é localizada.

Características:
- Estende a exceção base de negócio
- Representa uma regra clara do domínio
- Facilita o mapeamento direto para erros HTTP (ex: 404)

---

### 🔹 `GlobalExceptionHandler`

Classe responsável por **interceptar e tratar exceções globalmente**.

Utiliza:
- `@ControllerAdvice`
- `@ExceptionHandler`

Responsabilidades:
- Converter exceções em respostas HTTP padronizadas
- Retornar objetos `ApiError`
- Centralizar toda a lógica de tratamento de erros

---

## 📤 Exemplo de Resposta de Erro da API

```json
{
  "status": 404,
  "error": "TAREFA_NAO_ENCONTRADA",
  "message": "Tarefa não encontrada com o ID informado",
  "timestamp": "2025-01-01T14:30:00"
}
````

---

## ✅ Benefícios da Abordagem

* Código mais organizado e legível
* Tratamento de erros consistente
* Facilidade para testes
* Melhor experiência para o consumidor da API
* Arquitetura preparada para crescimento

---

## 🚀 Considerações Finais

Esta atualização reforça boas práticas no desenvolvimento de APIs REST, demonstrando como estruturar um **tratamento de exceções robusto, reutilizável e alinhado ao domínio da aplicação**.

Ideal para projetos que buscam profissionalização e padronização desde as camadas internas até a comunicação com o cliente.
