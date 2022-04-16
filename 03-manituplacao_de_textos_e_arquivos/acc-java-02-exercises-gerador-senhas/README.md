# Boas vindas ao repositório do desafio da Aceleração Java!

# Requisitos do desafio

Para este desafio, você deverá construir um pequeno programa que realize a criação de senhas. Como meta, o programa deve criar **10 senhas** com base em um padrão preestabelecido, armazenando-as separadamente em arquivos .txt.

O padrão para criação de senha deve seguir os seguinte critérios:

1. A senha estará relacionada com base no número do arquivo criado. Como o programa terá que gerar 10 arquivos, todos os arquivos possuirão um número relacionado.
   Ex : ARQUIVO_0, ARQUIVO_1, ARQUIVO_2, ARQUIVO_3, ..., ARQUIVO_9.

2. Para cada número existe uma correspondência, conforme explicita a lista abaixo:

NÚMERO 0 = A5$2;
NÚMERO 1 = B55S
NÚMERO 2 = CFFG
NÚMERO 3 = D&54
NÚMERO 4 = EEDF
NÚMERO 5 = FEGG
NÚMERO 6 = G15E
NÚMERO 7 = H123
NÚMERO 8 = I81F
NÚMERO 9 = JWEF
QUALQUER OUTRO NÚMERO = ###

3. A senha de cada arquivo será composta pela correspondência de seu número concatenado à correspondência do número +1.

Ex:
Para o ARQUIVO_0, a senha será a correspondência do número 0 (A5$2) + a correspondencia do número 1 (B55S) = A5$2B55S

Para o ARQUIVO_1, a senha será a correspondência do Número 1 (B55S) + a correspondência do Número 2 (CFFG) = B55SCFFG

Escreva seu código nos locais indicados no arquivo `GeradorSenhas.java`.

---
