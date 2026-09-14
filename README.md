# boas-praticas-software
1. Qual era o principal problema do código original?
   O código original concentrava dados, cálculo da média, regra de aprovação e exibição no método main, dificultando a manutenção, testes e reutilização.

3. Quais melhorias você realizou?
   -Criada a classe Aluno para representar os dados do estudante;
   -Criada a classe Avaliacao para calcular a média e verificar aprovação;
   -Mantida a classe Sistema apenas como ponto de entrada e apresentação;
   -Aplicados nomes mais claros, encapsulamento, atributos final e constante para a média mínima;
   -Padronizada a indentação e a organização do código.

5. Como a modularização facilitou a organização do código?
   Cada classe passou a ter uma responsabilidade específica. Assim, alterações nos dados do aluno, nas regras de avaliação ou na apresentação podem ser feitas separadamente, sem afetar diretamente as outras partes.

7. Como o Git ajudou a controlar as alterações realizadas no sistema?
   O Git permite registrar as alterações, visualizar diferenças entre versões, acompanhar a evolução do sistema e recuperar uma versão anterior caso necessário. Neste trabalho, ele também permite comparar o código original com a versão modularizada. Nenhum commit foi criado automaticamente.
