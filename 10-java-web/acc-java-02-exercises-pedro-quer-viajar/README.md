# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Pedro quer viajar

Pedro está planejando um mochilão por alguns países e precisa de uma ajuda para organizar a viagem. Ele começou a desenvolver o planejador de viagens, mas deixou o `PlanejandoDestino.java` por fazer! Esse planejador serve para compilar as capitais dos países que ele deseja visitar junto ao código DDI dos locais — informação fundamental para seu plano de viagem, servindo para entrar em contato com os hotéis, por exemplo.

Logo, temos aqui uma entidade (tabela) chamada `Country` que possui alguns atributos (colunas):

```Java
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String capital;
    private String ddi;
```

Você deverá complementar alguns métodos que já estão em nossa classe para ajudar na missão do mochilão. Abaixo você confere o que deve ser feito.

* No método `inserir()`, usar os recursos do Repository fornecido pelo spring-data a fim de incluir os dados dos países que estão nos planos do Pedro, no caso o `repository.save(Country entity)`. No momento, ele só tem os nomes dos países e de suas capitais, logo, após a chamada do método, nossa tabela deverá ficar desta forma:

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|NULL|
|ARGENTINA|BUENOS AIRES|NULL|
|URUGUAI|MONTEVIDEO|NULL|
|PANAMA|CIDADE DO PANAMA|NULL|

Pedro tinha se esquecido de pegar os códigos de discagem internacionais, poxa! Ele resolveu pegar e nos passar, o que gerou a necessidade de atualização da lista!

* No método  `corrigir()`, utilizar os recursos do repository para encontrar os países pelo nome (`findByName(String name)`) e atualizar (o `save(Country entity)`) seus itens, deixando a nossa tabela COUNTRY da seguinte forma:

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|+55|
|ARGENTINA|BUENOS AIRES|+54|
|URUGUAI|MONTEVIDEO|+598|
|PANAMA|CIDADE DO PANAMA|+507|

Só que, no meio desse planejamento todo, Pedro viu que não vai conseguir ir pro Panamá!

* Em `excluir()`, você deverá usar os recursos do repository para encontrar a entidade do Panamá (`findByName(String name)`) e o `delete(Country entity)` para eliminar esse registro. 

Após as três chamadas, a tabela Country deverá estar desta forma: 

| NAME | CAPITAL | DDI |
|----- | ------|-----|
|BRASIL|BRASILIA|+55|
|ARGENTINA|BUENOS AIRES|+54|
|URUGUAI|MONTEVIDEO|+598|

Boa sorte! E simbora ajudar o Pedro a realizar seu sonho da melhor forma possível! 🛫

