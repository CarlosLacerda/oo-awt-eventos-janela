# 🎓 Exercício 3 – Manipule Eventos de Botão e Janela

![Java](https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)
![AWT](https://img.shields.io/badge/GUI-AWT-blue?style=for-the-badge&logo=java&logoColor=white)
![Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)
![OO](https://img.shields.io/badge/Paradigma-Orienta%C3%A7%C3%A3o%20a%20Objetos-9cf?style=for-the-badge)

Repositório de exercícios da disciplina de **Orientação a Objetos**, com foco em interfaces gráficas utilizando a biblioteca **AWT (Abstract Window Toolkit)** do Java.

---

## 📚 Sobre a aula

Esta aula aprofunda o tratamento de **eventos** em aplicações gráficas Java, indo além dos eventos de clique já vistos anteriormente. O foco está no **ciclo de vida da janela** combinado com eventos de componentes, explorando:

- Eventos do ciclo de vida da janela (`windowOpened`, `windowClosing`) via `WindowAdapter`;
- Entrada de texto simples (`TextField`) e texto multilinha (`TextArea`);
- Tratamento de eventos de clique com expressão lambda (`ActionListener`);
- Limpeza de campos após o processamento dos dados;
- Encerramento correto da aplicação com `System.exit(0)`.

## 🎯 Objetivo

Criar uma aplicação AWT contendo:

- Um `TextField` para o **nome**;
- Um `TextArea` para **observações**;
- Um botão **Salvar**.

Comportamentos esperados:

| Evento | Ação esperada |
|---|---|
| Janela abre | Imprime `Janela aberta.` no console |
| Botão **Salvar** é clicado | Imprime nome e observações no console, depois limpa os campos |
| Janela é fechada | Imprime `Aplicação encerrada.` no console e finaliza o programa |

## 🗂 Estrutura do projeto

```
exercicio3/
├── Program.java   # Código-fonte da aplicação
└── README.md      # Este arquivo
```

## ▶️ Como executar

1. Certifique-se de ter o **JDK** instalado (Java 8 ou superior).
2. Compile o código:
   ```bash
   javac Program.java
   ```
3. Execute a aplicação:
   ```bash
   java Program
   ```

## 🖥️ Funcionamento

- Ao abrir, a janela **"Cadastro"** (450x300, `FlowLayout`) exibe `Janela aberta.` no console.
- O usuário preenche o **nome** e as **observações**.
- Ao clicar em **Salvar**, o console exibe:
  ```
  ----- Dados informados -----
  Nome: <nome informado>
  Observação:
  <texto da observação>
  ```
  Em seguida, os campos `TextField` e `TextArea` são limpos automaticamente.
- Ao fechar a janela, o console exibe `Aplicação encerrada.` e o programa é finalizado.

## 🛠 Tecnologias utilizadas

- ☕ Java (AWT)
- 🧩 Programação Orientada a Objetos (classes, eventos, listeners, expressões lambda)
- 🪟 Manipulação do ciclo de vida de janelas (`WindowAdapter`)

## ✅ Checklist do exercício

- [x] TextField para nome
- [x] TextArea para observações
- [x] Botão Salvar
- [x] Mensagem ao abrir a janela
- [x] Impressão dos dados ao salvar
- [x] Limpeza dos campos após salvar
- [x] Mensagem e finalização ao fechar a janela

## ✍️ Autor

Exercício desenvolvido como parte das atividades práticas da disciplina de Orientação a Objetos.
