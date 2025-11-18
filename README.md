# 🎭 Sistema de Venda de Entradas - Mack Theather

Este é um projeto em Java, desenvolvido para fins acadêmicos, que simula um sistema de venda de entradas para um teatro. A aplicação é executada via console (CLI) e permite o cadastro de espetáculos, clientes e a realização de compras de entradas com diferentes tipos de preços.

## ✨ Funcionalidades Principais

* **Cadastro de Espetáculos:** Permite adicionar novos espetáculos ao sistema, definindo nome, data, hora e preço-base.
* **Cadastro de Clientes:** Permite registrar clientes com nome e CPF.
* **Venda de Entradas:** Um fluxo de compra completo que inclui:
    * Listar espetáculos disponíveis.
    * Selecionar um espetáculo e visualizar o mapa de assentos.
    * Marcar assentos como ocupados.
    * Adicionar múltiplas entradas (carrinho) antes de finalizar.
* **Finalização de Compra:** Associa a compra (Pedido) a um cliente cadastrado e calcula o valor total.

## Conceitos de POO Aplicados

Este projeto demonstra diversos pilares da Programação Orientada a Objetos:

* **Herança e Polimorfismo:** A classe abstrata `Entrada` é estendida por `EntradaInteira`, `EntradaMeia` e `EntradaProfessor`. O método `calculaValor()` é sobrescrito em cada subclasse, permitindo que a classe `Pedido` calcule o total de forma polimórfica, sem precisar saber o tipo exato de cada entrada.
    * `EntradaInteira`: 100% do valor
    * `EntradaMeia`: 50% do valor
    * `EntradaProfessor`: 40% do valor
* **Encapsulamento:** As classes gerenciam seus próprios estados internos. Por exemplo, `Espetaculo` controla a disponibilidade de seus `assentos` e `Teatro` gerencia as listas de clientes e espetáculos.
* **Composição e Agregação:**
    * `Teatro` *é composto* por `Espetaculo` e `Cliente`.
    * `Cliente` *possui* uma lista de `Pedido`.
    * `Pedido` *é composto* por uma lista de `Entrada`.

##  Estrutura do Projeto

* **`Main.java`**: Ponto de entrada da aplicação. Controla o menu principal e a interação com o usuário via console.
* **`Teatro.java`**: Classe principal que atua como fachada (facade) do sistema, gerenciando os cadastros e o fluxo de compra.
* **`Espetaculo.java`**: Representa um show, contendo seus dados e o gerenciamento dos assentos (`boolean[]`).
* **`Cliente.java`**: Representa um cliente e armazena seu histórico de pedidos.
* **`Pedido.java`**: Representa o "carrinho de compras", agrupando as entradas de uma única transação.
* **`Entrada.java`**: Classe abstrata que define a base para um ingresso.
* **`EntradaInteira.java`**, **`EntradaMeia.java`**, **`EntradaProfessor.java`**: Subclasses concretas que implementam as regras de preço específicas.

##  Como Executar

1.  Certifique-se de ter o Java JDK instalado.
2.  Navegue até a pasta raiz do projeto.
3.  Compile todos os arquivos `.java`:
    ```bash
    javac *.java
    ```
4.  Execute a classe `Main`:
    ```bash
    java Main
    ```
