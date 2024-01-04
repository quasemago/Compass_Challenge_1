# Compass Challenge 1
Esse projeto foi desenvolvido por Bruno Patrick Formehl Ronning para o 1º desafio, ocorrido durante a 4ª semana do programa de bolsa de estágio da Compass UOL | Back-end Journey (Spring Boot) - AWS Cloud Context.

Esse primeiro desafio consiste em uma série de pequenos exercícios que irão ser separados por *packages* para uma melhor organização.

Segue a lista de exercícios:
- [Exercício 1](#Exercício-1---Quiz)
- [Exercício 2](#Exercício-2---Login)
- [Exercício 3](#Exercício-3---Bonus)

## Exercício 1 - Quiz
O primeiro exercício consiste em um quiz de perguntas e respostas, onde o usuário após informar seu nome, irá responder algumas perguntas, sendo informado se acertou ou não, e no final será informado o total de acertos e erros.

Para resolução desse exercício, foi criado uma classe entidade chamada de `Quiz`, que contém os atributos e métodos necessários para a execução do nosso quiz.
Essa classe contem nosso banco de questões e respostas, além de contar os acertos e erros do usuário.

Exemplo de resposta de saída:
```
Informe seu nome para iniciar o Quiz: Bruno Patrick

Responda a pergunta: Quantas vezes o Brasil venceu a copa do mundo de futebol? 5
Parabens, você acertou a questão!

Responda a pergunta: Quanto é 5+2? 7
Parabens, você acertou a questão!

Responda a pergunta: Qual foi o ano do descobrimento do Brasil? 1500
Parabens, você acertou a questão!

Responda a pergunta: Quanto é 25*2? 50
Parabens, você acertou a questão!

Responda a pergunta: Qual foi o ano em que o primeiro homem pisou na lua? 1968
Que pena, você errou a questão!

Usuário: Bruno Patrick
Acertos: 4
Erros: 1
```

## Exercício 2 - Login
O segundo exercício consiste em um sistema de login, onde o usuário irá informar seu nome e senha, e caso estejam corretos, o usuário será logado no sistema e irá receber uma mensagem de boas-vindas conforme o horário, caso contrário, o usuário será informado que o login falhou.

Para resolução desse exercício, foi criado uma classe entidade chamada de `Login`, que contém os atributos `username` e `password`.

Também foi criado uma classe de serviço chamada de `UserService`, essa classe irá simular um banco de dados armazenando nosso usuário e senha, e também irá conter o método `login`, que irá receber o nome e senha do usuário e irá verificar se o usuário existe e se a senha está correta.

Exemplo de resposta de saída:
```
Usuário: compass
Senha: 123456
Boa tarde, você se logou ao nosso sistema.
--
Usuário: teste
Senha: 159
Usuário e/ou senha incorretos.
```

## Exercício 3 - Bonus
O terceiro exercício consiste em um sistema para validar se um funcionário tem direito a bonificação. Para isso, o usuário irá informar a quantidade de funcionários que serão cadastrados, e para cada funcionário, será informado o nome, o salário.

O cálculo da bonificação é feito da seguinte forma:
- Se o salário for menor ou igual a 1000, a bonificação será de 20% do salário.
- Se o salário for maior que 1000 e menor que 2000, a bonificação será de 10% do salário.
- Se o salário for maior ou igual a 2000, em vez de bonificação, o funcionário receberá um desconto de 10% do salário.

Para resolução desse exercício, foi criado uma classe entidade chamada de `Employee`, que contém os atributos `name` e `salary`, sendo referente ao funcionário. Essa classe também contém os métodos `calculateBonusOrDiscount` que irá calcular o valor do bonus ou desconto de acordo com o salário do funcionário, o método `calculateNetSalary` que irá calcular o salário líquido do funcionário, e o método `shoudReceiveBonus` que irá validar se o funcionário irá receber um bonus ou desconto.

Exemplo de resposta de saída:
```
Informe o número de funcionários: 3

Funcionário #1
Informe o nome do funcionário: XPTO
Informe o salário do funcionário: 1200,00

Funcionário #2
Informe o nome do funcionário: XYZ
Informe o salário do funcionário: 3000,00

Funcionário #3
Informe o nome do funcionário: ABC
Informe o salário do funcionário: 700

RELATÓRIO:
Funcionário: XPTO
Salário: R$ 1200,00
Bônus: R$ 120,00
Salário Líquido: R$ 1320,00

Funcionário: XYZ
Salário: R$ 3000,00
Desconto: R$ 300,00
Salário Líquido: R$ 2700,00

Funcionário: ABC
Salário: R$ 700,00
Bônus: R$ 140,00
Salário Líquido: R$ 840,00
```