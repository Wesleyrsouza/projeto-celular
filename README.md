# Simulador de Celular em Java

Este projeto simula um celular com funcionalidades de reprodutor musical, aparelho telefônico e navegador na internet. As funcionalidades são modeladas usando interfaces, e a classe `Celular` implementa essas interfaces para fornecer as funcionalidades desejadas.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:

- **src/**: Diretório que contém os arquivos de código-fonte.
  - **ReprodutorMusical.java**: Interface que define os métodos para o reprodutor musical.
  - **AparelhoTelefonico.java**: Interface que define os métodos para o aparelho telefônico.
  - **NavegadorNaInternet.java**: Interface que define os métodos para o navegador na internet.
  - **Celular.java**: Classe que implementa as interfaces `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorNaInternet`.
  - **Main.java**: Classe principal que contém o método `main` para testar as funcionalidades do celular.
- **img/**: Pasta que contém os diagramas UML das classes e interfaces utilizadas no projeto.

### Interfaces

- `ReprodutorMusical` define os métodos relacionados ao reprodutor musical:
1.Tocar
2.Pausar
3.Selecionar Música (String musica)

- `NavegadorNaInternet` define os métodos relacionados a navegação na internet:
1.Exibir página
2.Adicionar nova aba
3.Atualizar página

- `AparelhoTelefonico` define os métodos relacionados ao reprodutor musical:
1.Ligar (String numero)
2.Atender
3.Inicar correio de voz

### Classes

- ** A classe `celular` implementa todos as interfaces citadas a cima.

- ** A classe `Main` contém o método `main` que cria uma instância de Celular e testa suas funcionalidades.
