# Estrutura De Dados  
Projeto desenvolvido durante a disciplina de Estrutura de Dados

Este repositório contém implementações básicas de estruturas de dados lineares, como **pilhas** e **filas circulares**, desenvolvidas do zero em Java. O objetivo foi compreender o funcionamento interno dessas estruturas, aplicar conceitos de abstração e modularidade, além de testar seu comportamento com exemplos práticos.

---

## Estruturas Implementadas

### Pilha (Stack)
- **Implementações:**
  - `ArrayStack`: Pilha estática baseada em array
  - `DynamicStack`: Pilha dinâmica que redimensiona automaticamente
  - `StaticStack`: Pilha estática com tamanho fixo
- **Interface:**
  - `Stack`: Define os métodos padrão (`push`, `pop`, `peek`, `isEmpty`, `isFull`)

### Fila Circular (Circular Queue)
- **Funcionalidade**: Implementação de uma fila circular com controle de inserção e remoção.
- **Classe**: `CircularQueue`
- **Teste**: Disponível na classe `Main.java`

---

## Estrutura do Projeto

```
.
├── .idea/                  → Configurações da IDE (ex.: IntelliJ IDEA)
├── CircularQueue/
│   └── Main.java           → Classe de teste para fila circular
├── Stack/
│   ├── ArrayStack.java     → Implementação de pilha com array
│   ├── DynamicStack.java   → Implementação de pilha dinâmica
│   ├── Main.java           → Classe de teste para pilhas
│   ├── Stack.java          → Interface com assinaturas dos métodos
│   └── StaticStack.java    → Implementação de pilha estática
├── .gitignore              → Arquivos ignorados pelo Git
└── README.md               → Este arquivo
```

---

## Objetivos Acadêmicos

- Entender o funcionamento interno de estruturas de dados lineares.
- Desenvolver habilidades de implementação manual sem depender de bibliotecas prontas.
- Aplicar boas práticas de programação, como uso de interfaces e encapsulamento.
- Realizar testes unitários manuais para validar o comportamento das estruturas.


---

**Desenvolvido como parte do aprendizado prático em Estrutura de Dados na faculdade.**
