# Boas vindas ao repositório do desafio da Aceleração Java!


# Requisitos do desafio

## Programa de fidelidade (milhas)

Que jornada até aqui, hein? 🤩

Olha... Estamos adorando ver sua evolução. Depois de tantas horas de Java e algumas de Quarkus, queremos te propor um desafio um pouco maior agora. Simbora?

Você foi contratado por uma empresa que está criando o seu programa de fidelidade, nos moldes de um programa de milhagem. Clientes da empresa podem receber milhas, transferir para outra pessoa ou resgatar em algum produto ou serviço.

O sistema tem cinco tabelas:
- Pessoa
- Lancamento
- TipoLancamento
- Produto
- Parceiro

Essas tabelas estão disponíveis num banco H2 em memória que sobe junto com a aplicação. Caso queira conferir a criação e os dados iniciais de cada tabela, veja o arquivo `cargainicial.sql`, dentro da pasta de resources. Os domínios "TipoLancamento", "Produto" e "Parceiro" já estão com seus dados cadastrados. Para facilitar os testes e o uso, o sistema inicia com duas pessoas e um lançamento de crédito de 10 mil milhas para cada uma:

- Login huguinho / Senha: root
- Login zezinho / Senha: senha

Você vai receber o sistema em um estágio mediano de desenvolvimento, e sua tarefa é implementar as funcionalidades necessárias para que todos os testes passem. Fechou?

Existem três papéis de uso do sistema: admin, pessoa usuária e público. 

O papel de admin é usado por outro sistema para se comunicar com o seu. Os endpoints de admin incluem listagem dos domínios (um domínio é uma lista de código e nome/descrição), consulta de todos os saldos de todas as pessoas usuárias, resgate de pontos com valor variável e crédito de pontos. Os endpoints de admin possuem um parâmetro de query chamado "token", cujo valor deve ser **sempre** `4dmt0k3n!`.

O papel de pessoa usuária dá acesso aos endpoints de gestão de sua própria conta: depois de usar o endpoint de login para criar um token pessoal, é possível transferir pontos para outra conta, resgatar pontos na aquisição de produtos ou serviços, consultar saldo, extrato e encerrar conta. Esse papel só permite alterações na conta na qual foi feito o login!

No modo público, apenas o endpoint/echo que responde `Olá!` serve para garantirmos que a aplicação está funcionando.

Vamos aos requisitos (que listamos aqui, mas você pode também inferir dos testes!):

- Tentativa de acessar endpoints fechados com o token ausente ou inválido devem resultar em erro 500 com a mensagem `Acesso não autorizado.`
- Tentativa de login com qualquer informação incorreta deve resultar em erro 500 com a mensagem `Autenticacão inválida.`
- Tentativa de retirada em conta com saldo inferior ao da retirada deve resultar em erro 500 com a mensagem `Saldo insuficiente.`
- Lançamentos podem possuir valores **positivos** ou **negativos** na base de dados, mas na nossa API sempre vão chegar **positivos**. Tome cuidado com retiradas e transferências!
- O arquivo `openapi-programa-milhas.txt` na raiz do projeto é a especificação Open API completa para o sistema.



Pronto? Então valendo! 🕗

