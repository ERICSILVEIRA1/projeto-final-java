# projeto-final-java
 Este é um App de "game card deck"

O seu objetivo é invocar os Espíritos Ancestrais e Dominar o Campo de Batalha em "Duelo Ancestral Hermético"!
Prepare-se para duelos de cartas épicos em um mundo de fantasia épica com "Duelo Ancestral Hermético", um jogo de cartas colecionáveis estratégico e cheio de ação!

Colecione cartas poderosas que representam os espíritos ancestrais de guerreiros lendários, magos poderosos e criaturas míticas. Invoque esses espíritos para o campo de batalha e utilize suas habilidades únicas para derrotar seus oponentes em combates estratégicos.

Crie decks imbatíveis com combinações sinérgicas de cartas e domine seus inimigos com combos devastadores. Explore diferentes estilos de jogo e torne-se o mestre do "Duelo Ancestral Hermético"! Ainda é possível cadastrar cartas novas e jogar com outro duelista de forma "contra no sofá!"

O que te espera em "Duelo Ancestral Hermético":

Um mundo de fantasia rico e detalhado: Explore um mundo vibrante habitado por criaturas mágicas e seres lendários.
Centenas de cartas para colecionar: Descubra uma variedade enorme de cartas, cada uma com habilidades e poderes únicos.
Estratégia profunda e recompensadora: Domine as mecânicas de jogo intuitivas e construa decks imbatíveis para superar seus oponentes.
Combates dinâmicos e emocionantes: Invoque seus espíritos ancestrais e utilize suas habilidades devastadoras para derrotar seus inimigos.
Um sistema de jogo em constante evolução: Novas cartas e expansões são lançadas regularmente, garantindo novas estratégias e desafios para você explorar.
Junte-se à comunidade de "Duelo Ancestral Hermético" e:

Participe de torneios emocionantes e ganhe prêmios incríveis.
Compartilhe suas decks e estratégias com outros jogadores.
Aprenda com os melhores jogadores e aprimore suas habilidades.
Contribua para o desenvolvimento do jogo e ajude a moldar o seu futuro.
Se cadastre neste "Duelo Ancestral Hermético" hoje mesmo e:

Comece sua jornada épica para se tornar o mestre dos duelos!
Desvende os segredos do mundo dos espíritos ancestrais.
Construa sua lenda e domine o campo de batalha!

Duelo dos Ancestrais: Onde estratégia, poder e glória se unem!




A classe Card contem: Esta classe Card representa uma estrutura básica para cartas de um jogo, contendo informações como nome, descrição, pontos de ataque e pontos de defesa. Ela inclui métodos para acesso a esses atributos e implementa validações básicas no construtor para garantir que os valores fornecidos sejam válidos. Além disso, possui métodos abstratos para serem implementados por subclasses, como get e writeToFile, permitindo operações específicas de acesso e escrita de cartas.



A classe ClassCard: Esta classe ClassCard representa um modelo básico para cartas de classe em um jogo, contendo atributos como nome, descrição, pontos de ataque e pontos de defesa. Ela implementa validações no construtor para garantir que os valores fornecidos sejam válidos (nome e descrição não podem ser nulos ou vazios, pontos de ataque e defesa não podem ser negativos). Além disso, possui um método writeToFile que escreve os detalhes da carta em um objeto PrintWriter, útil para salvar informações da carta em um arquivo ou outro destino de saída.



A classe Console: faz  Esta classe Deck representa um baralho de cartas em um jogo, oferecendo métodos para adicionar cartas, embaralhar o baralho, retirar cartas (ou uma quantidade específica delas) e obter uma representação das cartas presentes no baralho.
Essa classe fornece funcionalidades essenciais para manipular um baralho de cartas, permitindo adição, remoção, embaralhamento e recuperação das cartas presentes. É utilizada em conjunto com outras classes, como Dealer e Player, para simular jogos de cartas e operações relacionadas.



A classe Game: Esta classe Game representa a lógica principal de um jogo de cartas entre dois jogadores (player1 e player2), utilizando um baralho (deck) e gerenciando o estado do jogo. Essa classe coordena as interações principais do jogo, como iniciar o jogo, gerenciar rodadas entre os jogadores, verificar o estado do jogo e manipular a persistência de dados (escrevendo cartas em arquivo).


A classe GameDois: Esta classe GameDois implementa um jogo simplificado de cartas (possivelmente um jogo como Blackjack) em Java, utilizando classes como Player, Dealer, e Deck para simular interações entre jogadores e um dealer.
Esta classe encapsula a lógica de jogo básica, incluindo manipulação de cartas, regras de jogo e interações entre jogador e dealer, proporcionando uma simulação de um jogo de cartas interativo em um ambiente de console.



A classe Gerenciador: faz Esta classe Gerenciador fornece funcionalidades para salvar, ler e gerenciar jogos em um arquivo de texto (game.txt).
Resumidamente, essa classe facilita a persistência e recuperação de objetos Game em um arquivo de texto, permitindo operações básicas de CRUD (criar, ler, atualizar, deletar) para jogos armazenados de forma simples.



A classe Hand faz: Esta classe Hand representa uma mão de cartas em um jogo de cartas, como Blackjack.
Essa classe é utilizada para gerenciar as operações básicas relacionadas a uma mão de cartas durante um jogo, incluindo adição de cartas, cálculo do valor da mão, remoção de cartas e obtenção de informações sobre as cartas presentes na mão.


A classe monsterCard: Esta classe MonsterCard representa um tipo específico de carta de monstro em um jogo fictício de cartas.
Essa classe é projetada para encapsular as características específicas de uma carta de monstro, como seu nível, além dos atributos gerais fornecidos pela classe base Card. Ela também fornece métodos para acessar diretamente os pontos de ataque e defesa da carta de monstro, facilitando seu uso e manipulação dentro de um contexto de jogo de cartas.


A classe Player: Esta classe Player representa um jogador em um jogo de cartas fictício. Essa classe encapsula as funcionalidades básicas de um jogador em um jogo de cartas, como manipulação de cartas na mão, interação com o baralho e ações que o jogador pode realizar durante o jogo.


A classe SpelCard: Esta classe SpellCard representa um tipo específico de carta em um jogo fictício de cartas. 
Essa classe encapsula as características e comportamentos específicos de uma carta de feitiço, incluindo a capacidade de descrever seu efeito e exportar suas informações para um arquivo.


A classe TrapCard: Essa classe TrapCard representa um tipo específico de carta em um jogo fictício de cartas
Essa classe encapsula as características e comportamentos específicos de uma carta de armadilha, incluindo a capacidade de descrever seu efeito e exportar suas informações para um arquivo.










