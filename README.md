# 🎟️ Sistema Web de Inscrição em Evento

## 📌 Sobre o Projeto

O **Sistema Web de Inscrição em Evento** é uma aplicação web desenvolvida em Java para realizar inscrições em eventos, permitindo que os participantes informem seus dados, escolham a modalidade de participação e selecionem sua categoria.

O sistema calcula automaticamente o valor da inscrição de acordo com a categoria escolhida e aplica um desconto para participantes na modalidade online.

O projeto foi desenvolvido com o objetivo de praticar conceitos de desenvolvimento Web com Java, utilizando Servlets, JSP e sessões HTTP.

---

## 🎯 Funcionalidades

- Cadastro de participantes por meio de formulário.
- Seleção da modalidade de participação (Presencial ou Online).
- Seleção da categoria (Aluno, Professor ou Convidado).
- Cálculo automático do valor da inscrição.
- Aplicação de 20% de desconto para inscrições online.
- Exibição dos dados e do valor final da inscrição.
- Armazenamento dos dados do participante em sessão.
- Consulta dos dados da inscrição.
- Encerramento da sessão (Logout).

---

## 💰 Regras de Negócio

O valor da inscrição é definido conforme a categoria do participante:

| Categoria | Valor |
|---|---:|
| Aluno | R$ 30,00 |
| Professor | R$ 50,00 |
| Convidado | R$ 80,00 |

**Desconto:** participantes que escolhem a modalidade Online recebem 20% de desconto sobre o valor da inscrição.

---

## 🛠️ Tecnologias Utilizadas

- **Java 8** — Linguagem principal.
- **Java Servlets** — Processamento das requisições HTTP.
- **JSP (JavaServer Pages)** — Construção das páginas dinâmicas.
- **HTML5** — Estrutura das páginas.
- **CSS3** — Estilização da interface.
- **Apache Tomcat 9** — Servidor de aplicação.
- **Eclipse IDE** — Ambiente de desenvolvimento.

---

## 📂 Estrutura do Projeto

```text
Sistema-Web-de-Inscricao-em-Evento/
│
├── src/
│   ├── business/
│   │   └── Inscricao.java
│   │
│   ├── model/
│   │   └── Participante.java
│   │
│   └── servlets/
│       ├── ServletInscricao.java
│       └── ServletLogout.java
│
├── WebContent/
│   ├── css/
│   │   └── style.css
│   │
│   ├── WEB-INF/
│   │   └── web.xml
│   │
│   ├── index.jsp
│   ├── resultado.jsp
│   └── minhaInscricao.jsp
│
└── README.md
```

---

## ⚙️ Como Executar

1. Clone este repositório:

```bash
git clone https://github.com/JP-GhOsT/Sistema-Web-de-Inscricao-em-Evento.git
```

2. Abra o Eclipse IDE.
3. Importe o projeto como um **Dynamic Web Project**.
4. Configure o JDK 8 e o Apache Tomcat 9.
5. Adicione o projeto ao servidor Tomcat.
6. Inicie o servidor.
7. Acesse no navegador:

```text
http://localhost:8080/Sistema-Web-de-Inscri-o-em-Evento/
```

---

## 👨‍💻 Desenvolvedores

- **João Paulo Zimmermann Matusi**
- **Gustavo Sena de Souza**

---

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos e educacionais.
