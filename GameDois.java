public class GameDois {
    public static void main(String[] args) {
        // Criar um novo jogo
        Game game = new Game();

        // Inicia o jogo
        game.startGame();
    }

    public static class Game {

        private static final String Player1 = null;
        private static final String Player = null;
        private static final String Dealer = null;

        public static String getPlayer1() {
            return Player1;
        }

        public void startGame() {
            // Cria um novo deck de cartas
            Deck deck = new Deck();

            // Cria um novo jogador e um novo duelista
            Player player = new Player(Player);
            Dealer dealer = new Dealer(Dealer);
            player.setDealer(dealer);
            dealer.setPlayer(player);
           

            // Distribui cartas para o jogador e o dealer
            player.drawCard(deck);
            player.drawCard(deck);
            dealer.drawCard(deck);
            dealer.drawCard(deck);

            // Mostra as cartas do jogador e do dealer
            player.printHand();
            dealer.printFirstHand();

            // Inicia o turno do jogador
            playerTurn(player, dealer, deck);
        }

        public void playerTurn(Player player, Dealer dealer, Deck deck) {
            // Mostra as opções do jogador
            System.out.println("Opções:");
            System.out.println("1. Hit");
            System.out.println("2. Stand");
            System.out.println("3. Double Down");
            System.out.println("4. Split");

            // Le a escolha do jogador
            int choice = Integer.parseInt(System.console().readLine());

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
        Player player = new Player(GameDois.Game.Player); // Declara e inicializa a variavel player
        // Compara as mãos do jogador e do dealer
        if (player.getHand().calculatedValue() <= dealer.getHand().calculatedValue()) {
            System.out.println("Você venceu!");
        } else if (player.getHand().calculatedValue() < dealer.getHand().calculatedValue()) {
                    System.out.println("O dealer venceu!");
                } else {
                    System.out.println("Empate!");
                }
            }
        }

        public static void executar() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'executar'");
        }
    }
}