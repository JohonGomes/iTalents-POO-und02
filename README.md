Claro, vou criar um README.md com as informações solicitadas:

# Exercícios de Herança e Polimorfismo em Java

Este repositório contém a implementação de diversos exercícios relacionados a herança e polimorfismo em Java.

## Exercício 1: Veículos

Neste exercício, é criada uma classe `Veiculo` com atributos como modelo e ano. Em seguida, são criadas duas subclasses, `Carro` e `Moto`, que herdam de `Veiculo`. Cada subclasse possui pelo menos 2 atributos e 1 método a mais.

```java
class Veiculo {
    protected String modelo;
    protected int ano;

    // Métodos da classe Veiculo
}

class Carro extends Veiculo {
    private int numPortas;
    private String cor;

    // Métodos da classe Carro
}

class Moto extends Veiculo {
    private int cilindrada;
    private boolean temPartidaEletrica;

    // Métodos da classe Moto
}
```

## Exercício 2: Hierarquia de Animais

Neste exercício, é criada uma hierarquia de classes representando diferentes tipos de animais. A classe base é `Animal`, com as subclasses `Mamifero`, `Ave` e `Peixe`.

```java
class Animal {
    // Atributos e métodos da classe Animal
}

class Mamifero extends Animal {
    // Atributos e métodos da classe Mamifero
}

class Ave extends Animal {
    // Atributos e métodos da classe Ave
}

class Peixe extends Animal {
    // Atributos e métodos da classe Peixe
}
```

## Exercício 3: Contas Bancárias

Neste exercício, é criada uma classe `ContaBancaria` com atributos como saldo e número da conta. Em seguida, são criadas duas subclasses, `ContaCorrente` e `ContaPoupanca`, que herdam de `ContaBancaria`.

```java
class ContaBancaria {
    protected double saldo;
    protected int numeroConta;

    // Métodos da classe ContaBancaria
}

class ContaCorrente extends ContaBancaria {
    // Atributos e métodos da classe ContaCorrente
}

class ContaPoupanca extends ContaBancaria {
    // Atributos e métodos da classe ContaPoupanca
}
```

## Exercício 4: Sobrescrita de Métodos em Veículos

Neste exercício, é criado um método `imprimirInformacoes` na classe base `Veiculo`, que é sobrescrito nas subclasses `Carro` e `Moto` para exibir informações específicas de cada veículo.

```java
class Veiculo {
    // ...

    public void imprimirInformacoes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

class Carro extends Veiculo {
    // ...

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Número de portas: " + numPortas + ", Cor: " + cor);
    }
}

class Moto extends Veiculo {
    // ...

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindrada: " + cilindrada + ", Partida Elétrica: " + temPartidaEletrica);
    }
}
```

## Exercício 5: Emissão de Som em Animais

Neste exercício, é adicionado um método `emitirSom` à classe base `Animal`, que é sobrescrito nas subclasses `Mamifero`, `Ave` e `Peixe` para emitir sons específicos de cada tipo de animal.

```java
class Animal {
    // ...

    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

class Mamifero extends Animal {
    // ...

    @Override
    public void emitirSom() {
        System.out.println("O mamífero emite um som característico.");
    }
}

class Ave extends Animal {
    // ...

    @Override
    public void emitirSom() {
        System.out.println("A ave emite um canto.");
    }
}

class Peixe extends Animal {
    // ...

    @Override
    public void emitirSom() {
        System.out.println("O peixe emite um som subaquático.");
    }
}
```

## Exercício 6: Polimorfismo por Sobrecarga

Neste exercício, é criada uma classe `Calculadora` que possui métodos para as 4 operações básicas (soma, subtração, multiplicação, divisão), aceitando diferentes tipos de parâmetros.

```java
class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    // Métodos para multiplicação e divisão
}
```

## Exercício 7: Formas Geométricas

Neste exercício, é criada uma classe `FormaGeometrica` com métodos para calcular área e perímetro. Em seguida, são criadas subclasses como `Circulo`, `Retangulo` e `Triangulo` que herdam de `FormaGeometrica` e implementam esses métodos.

```java
class FormaGeometrica {
    // Atributos e métodos para calcular área e perímetro
}

class Circulo extends FormaGeometrica {
    // Atributos e implementação dos métodos de área e perímetro
}

class Retangulo extends FormaGeometrica {
    // Atributos e implementação dos métodos de área e perímetro
}

class Triangulo extends FormaGeometrica {
    // Atributos e implementação dos métodos de área e perímetro
}
```

## Exercício 8: Polimorfismo em Lista de Animais

Neste exercício, é utilizada a hierarquia de classes de animais do exercício 2 para criar uma lista de animais. Em seguida, é percorrida a lista chamando o método `emitirSom` de cada animal.

```java
List<Animal> animais = new ArrayList<>();
animais.add(new Mamifero());
animais.add(new Ave());
animais.add(new Peixe());

for (Animal animal : animais) {
    animal.emitirSom();
}
```

## Exercício 9: Aplicação de Juros em Contas Bancárias

Neste exercício, é expandida a classe `ContaBancaria` do exercício 3, adicionando um método `aplicarJuros` que é implementado de maneira diferente nas subclasses `ContaCorrente` e `ContaPoupanca`.

```java
class ContaBancaria {
    // ...

    public void aplicarJuros() {
        // Implementação padrão
    }
}

class ContaCorrente extends ContaBancaria {
    // ...

    @Override
    public void aplicarJuros() {
        saldo *= 1.15; // 15% de juros
    }
}

class ContaPoupanca extends ContaBancaria {
    // ...

    @Override
    public void aplicarJuros() {
        saldo *= 1.065; // 6,5% de juros
    }
}
```

## Exercício 10: Interface Autenticável

Neste exercício, é criada uma interface `Autenticavel` com um método `autenticar`. A interface é implementada nas classes `Usuario` e `Administrador`. Em seguida, é criada uma lista de objetos que implementam `Autenticavel` e o método `autenticar` é chamado para cada um.

```java
interface Autenticavel {
    boolean autenticar(String login, String senha);
}

class Usuario implements Autenticavel {
    // Implementação do método autenticar
}

class Administrador implements Autenticavel {
    // Implementação do método autenticar
}

List<Autenticavel> autenticaveis = new ArrayList<>();
autenticaveis.add(new Usuario());
autenticaveis.add(new Administrador());

for (Autenticavel autenticavel : autenticaveis) {
    autenticavel.autenticar("login", "senha");
}
```

Esse README contém a descrição de todos os exercícios solicitados, incluindo a implementação em Java de cada um deles. Sinta-se à vontade para explorar o código e entender melhor os conceitos de herança e polimorfismo em Java.
