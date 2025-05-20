Atividade da faculdade, a qual atendeu as seguintes recomendações:
  REQUISITOS FUNCIONAIS
  • O programa deve apresentar ao usuário 3 opções de menu:
  
  1 - Cadastrar Times
  2 – Simular Jogos
  3 – Sair
  • Na opção 1 (Cadastrar Times), deve ser disponibilizado ao usuário fazer a entrada dos nomes dos times.
  
  • Na opção 2 (Simular Jogos) o programa deve:
  
  1. Permitir ao usuário deve escolher 2 times para um jogo;
  2. Em seguida efetuar a simulação do jogo;
  3. Apresentar na tela o resultado do jogo;
  4. Imprimir a tabela de pontuação do campeonato atualizada.
  • Na opção 3, o programa deve ser encerrado.

  REGRAS DE NEGÓCIO E OUTROS DETALHES
  
  1. O sistema deve limitar o cadastro de times até, no máximo, 10 times;
  
  2. Para calcular a pontuação considere: Vitória = 3, Empate = 1 e Derrota = 0;
  
  3. Para a simulação do jogo deve ser feito sorteados (aleatoriamente – pesquisar como gerar números aleatórios no Java) os gols marcados pelo time 1 e os gols marcados pelo time 2.
  
  4. Um time A não pode enfrentar outro time B por mais de 1 vez;
  
  a. Se o usuário repetir a dupla de times para um novo jogo o programa deve retornar a seguinte mensagem “Este jogo já foi realizado! Escolha outra dupla de times.”;
  
  5. Quando todos os times já tiverem se enfrentado e não houver mais a possibilidade de escolher um jogo, o programa deve apresentar o nome do(s) time(s) campeão(ões);
  
  REQUISITOS NÃO FUNCIONAIS
  
  1. Antes de iniciar a codificação do projeto a criação o diagrama de classe do projeto, mostrando o relacionamento (associações) entre as classes do projeto
  
  2. O projeto deve ter no mínimo 3 classes, desconsiderando a classe principal;a. As classes, atributos e métodos devem ser definidos por você usando sua capacidade de
  
  abstração;
  
  3. Os dados do projeto devem ser armazenados na memória RAM em uma estrutura de array.
  
  Assim é obrigatório o uso da classe ArrayList;
  
  4. Para fazer a entrada de dados com o usuário e troca de mensagens deve ser usada a classe JOptionPane, porém a saída da tabela do campeonato poderá ser impressa no console.
  
  5. Você deve criar uma classe estática (somente com métodos estáticos, pesquise sobre o assunto) para encapsular os métodos de leitura/escrita de dados com o usuário. Nesta classe, deve ser feita as conversões de dados necessárias e tratamentos de erros (de conversão de tipos e outros)

Além do pedido, adicionei uma forma de simular todos os jogos de umz vez, evitando a simulação manual caso tenha diversos times.
