import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Game game = new Game(player1, player2);
        game.writeCardsToFile("cards.txt");
    }
    private Player player1;
    private Player player2;

    private Deck deck;

    Game game = new Game(player1, player2);

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
    }

    public Game(Player player1, Player player2, Deck deck, Game game) {
        this.player1 = player1;
        this.player2 = player2;
        this.deck = deck;
        this.game = game;
    }

        public void startGame() {
            deck.shuffle(); // Embaralha o deck
            int halfDeckSize = deck.getCards().length / 2;
            player1.setHand(new Hand(deck.drawCards(halfDeckSize))); // Distribui metade do deck para o jogador 1
            player2.setHand(new Hand(deck.drawCards(halfDeckSize))); // Distribui metade do deck para o jogador 2
    }

   
        public void playTurn(Player currentPlayer) {
            Card card = currentPlayer.getHand().drawCard(); // O jogador escolhe uma carta da sua mão
            deck.addCard(card); // Adiciona a carta ao deck
            System.out.println(currentPlayer.getName() + " jogou " + card); // Mostra a carta jogada
        }
    
  
        public void endGame() {
            if (player1.getHand().isEmpty()) {
                System.out.println("Jogador 2 venceu!");
            } else if (player2.getHand().isEmpty()) {
                System.out.println("Jogador 1 venceu!");
            } else {
                System.out.println("O jogo ainda não terminou.");
            }
        }
    

    public void writeCardsToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            for (Card card : deck.getCards()) {
                card.writeToFile(writer);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
        game.writeCardsToFile("cards.txt");
    }
    public Player getPlayer1() {
        return player1;
    }

    public void setPlayer1(Player player1) {
        this.player1 = player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void setPlayer2(Player player2) {
        this.player2 = player2;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "Game [player1=" + player1 + ", player2=" + player2 + ", deck=" + deck + ", game=" + game
                + ", getPlayer1()=" + getPlayer1() + ", getPlayer2()=" + getPlayer2() + ", getDeck()=" + getDeck()
                + ", getGame()=" + getGame() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
                + ", toString()=" + super.toString() + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((player1 == null) ? 0 : player1.hashCode());
        result = prime * result + ((player2 == null) ? 0 : player2.hashCode());
        result = prime * result + ((deck == null) ? 0 : deck.hashCode());
        result = prime * result + ((game == null) ? 0 : game.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Game other = (Game) obj;
        if (player1 == null) {
            if (other.player1 != null)
                return false;
        } else if (!player1.equals(other.player1))
            return false;
        if (player2 == null) {
            if (other.player2 != null)
                return false;
        } else if (!player2.equals(other.player2))
            return false;
        if (deck == null) {
            if (other.deck != null)
                return false;
        } else if (!deck.equals(other.deck))
            return false;
        if (game == null) {
            if (other.game != null)
                return false;
        } else if (!game.equals(other.game))
            return false;
        return true;
    }

    public static void executar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'executar'");
    }

}
