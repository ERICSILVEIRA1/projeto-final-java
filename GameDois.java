public class GameDois {
    public static void main(String[] args) {
        // Cria um novo jogo
        Game game = new Game(new Player("Jogador 1"), new Player("Jogador 2"), new Deck());

        // Inicia o jogo
        game.startGame();
    }

    public static class Game {
        private Player player1;
        private Player player2;
        private Deck deck;

        public Game(Player player1, Player player2, Deck deck) {
            this.player1 = player1;
            this.player2 = player2;
            this.deck = deck;
        }

        public void startGame() {
            // Cria um novo deck de cartas
            deck = new Deck();

            // Adiciona cartas ao deck
            for (int i = 1; i <= 52; i++) {
                deck.addCard(new Card("Card" + i, "Description" + i, i % 13, i % 13));
            }

            // Embaralha o deck
            deck.shuffle();

            // Cria um novo dealer
            Dealer dealer = new Dealer("Dealer");

            // Distribui cartas para o jogador e o dealer
            player1.drawCard(deck);
            player1.drawCard(deck);
            dealer.drawCard(deck);
            dealer.drawCard(deck);

            // Mostra as cartas do jogador e do dealer
            player1.printHand();
            dealer.printFirstHand();

            // Inicia o turno do jogador
            playerTurn(player1, dealer, deck);
        }

        public void playerTurn(Player player, Dealer dealer, Deck deck) {
            // Mostra as opções do jogador
            System.out.println("Opções:");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
            System.out.println("3. Double Down");
            System.out.println("4. Split");

            // Lê a escolha do jogador
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            // Processa a escolha do jogador
            switch (choice) {
                case 1:
                    player.hit(deck);
                    break;
                case 2:
                    player.stand();
                    break;
                case 3:
                    player.doubleDown(deck);
                    break;
                case 4:
                    player.split(deck);
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            // Verifica se o jogador venceu ou perdeu
            if (player.getHand().calculatedValue() > 21) {
                System.out.println("Você perdeu!");
            } else if (player.getHand().calculatedValue() == 21) {
                System.out.println("Você venceu!");
            } else {
                // Inicia o turno do dealer
                dealerTurn(dealer, deck);
            }
        }

        public void dealerTurn(Dealer dealer, Deck deck) {
            // Mostra as cartas do dealer
            dealer.printHand();

            // Verifica se o dealer precisa puxar mais cartas
            while (dealer.getHand().calculatedValue() < 17) {
                dealer.hit(deck);
            }

            // Verifica se o dealer venceu ou perdeu
            if (dealer.getHand().calculatedValue() > 21) {
                System.out.println("O dealer perdeu!");
            } else if (dealer.getHand().calculatedValue() == 21) {
                System.out.println("O dealer venceu!");
            } else {
                // Compara as mãos do jogador e do dealer
                if (player1.getHand().calculatedValue() > dealer.getHand().calculatedValue()) {
                    System.out.println("Você venceu!");
                } else if (player1.getHand().calculatedValue() < dealer.getHand().calculatedValue()) {
                    System.out.println("O dealer venceu!");
                } else {
                    System.out.println("Empate!");
                }
            }
        }
    }
}