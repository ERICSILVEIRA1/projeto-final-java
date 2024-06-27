public class Dealer {
    private Hand hand;
    private Player player;

    public Dealer(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.player = new Player(name);
        this.hand = new Hand();
    }

    public void setPlayer(Player player) {
        if (player == null) {
            throw new IllegalArgumentException("Player cannot be null");
        }
        this.player = player;
    }

    public void drawCard(Deck deck) {
        if (deck == null) {
            throw new IllegalArgumentException("Deck cannot be null");
        }
        Card card = deck.drawCard();
        hand.addCard(card);
    }

    public void printFirstHand() {
        if (hand.getCards().isEmpty()) {
            System.out.println(player.getName() + " has no cards in hand.");
        } else {
            System.out.println(player.getName() + "'s first hand: " + hand.getCards().get(0));
        }
    }

    public void printHand() {
        if (hand.getCards().isEmpty()) {
            System.out.println(player.getName() + " has no cards in hand.");
        } else {
            System.out.println(player.getName() + "'s hand: " + hand);
        }
    }

    public Hand getHand() {
        return hand;
    }

    public void hit(Deck deck) {
        drawCard(deck);
    }
}