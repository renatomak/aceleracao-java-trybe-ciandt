# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio: Sistema de Recursos Humanos

Neste desafio, você deverá implementar um sistema de recursos humanos utilizando os conceitos de métodos abstratos e `Override`.

Imagine que você está trabalhando em uma equipe e ficou responsável pela criação da classe `Funcionario`, que deve ter como atributos `String nome`, `String cpf` e `double salarioBruto`, bem como seus respectivos métodos `Getters` e `Setters`. A classe também deve ter o método `calcularSalarioLiquido()`, que retorna um valor do tipo `double` representando o salário líquido do funcionário (esse método não recebe nenhum parâmetro). 

No sistema de recursos humanos, haverá dois tipos de funcionários: as pessoas físicas e as pessoas jurídicas. Assim, o código deve ter mais duas classes: a classe `FuncionarioPessoaFisica` e a classe `FuncionarioPessoaJuridica`, ambas herdando da classe `Funcionario`. Como os funcionários serão ou pessoa física ou pessoa jurídica, nenhum objeto deve ser instanciado da classe `Funcionario`.

A taxa do imposto de renda é diferente para a pessoa física e para a pessoa jurídica, então cada classe terá seu próprio método `calcularSalarioLiquido()`. Para exemplificar o cálculo do salário líquido, considere uma taxa de imposto de renda:

- de 20% pessoa física — ou seja, se o salário bruto da pessoa física é R$ 5.000,00, o salário líquido dela será R$ 4.000,00.
- de 10% para pessoa jurídica — ou seja, se o salário bruto da pessoa jurídica é R$ 5.000,00, seu salário líquido será R$ 4.500,00.


Resumindo, você implementará 3 classes: `Funcionario`, `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica`. A classe `Funcionario` deve ser abstrata e conter os atributos `String nome`, `String cpf`, e `double salarioBruto`, com seus respectivos métodos `Getters` e `Setters`, e também com o método `calcularSalarioLiquido()`. As classes `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica` devem herdar de `Funcionario` e implementar o método `calcularSalarioLiquido()` com suas respectivas taxas de imposto de renda.

# Exemplo
Se eu escrever um método `main` e instanciar os objetos das classes `FuncionarioPessoaFisica` e `FuncionarioPessoaJuridica`, setando seus respectivos salários brutos, por exemplo:
```java
public static void main(String[] args) {
    
    FuncionarioPessoaFisica pessoaFisica = new FuncionarioPessoaFisica();
    pessoaFisica.setSalarioBruto(5000);
    System.out.println("O salário líquido pessoa física: " + pessoaFisica.calcularSalarioLiquido());
    
    
    FuncionarioPessoaJuridica pessoaJuridica = new FuncionarioPessoaJuridica();
    pessoaJuridica.setSalarioBruto(5000);    
    System.out.println("O salário líquido pessoa jurídica: " + pessoaJuridica.calcularSalarioLiquido());
}
```
a saída deverá ser:
```
O salário líquido pessoa física: 4000.0
O salário líquido pessoa jurídica: 4500.0
```

Após resolver esse desafio, você saberá exatamente quando e por que usar classes abstratas, e estará um passo mais perto do profissionalismo!


---
