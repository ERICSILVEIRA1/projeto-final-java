public class Dealer {
    private Hand hand;
    private Player player;

    public Dealer(String name) {
        this.player = new Player(name);
        this.hand = new Hand();
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void drawCard(Deck deck) {
        Card card = deck.drawCard();
        hand.addCard(card);
    }

    public void printFirstHand() {
        System.out.println(player.getName() + "'s first hand: " + hand.getCards().get(0));
    }

    public void printHand() {
        System.out.println(player.getName() + "'s hand: " + hand);
    }

    public Hand getHand() {
        return hand;
    }

    public void hit(Deck deck) {
        drawCard(deck);
    }
}
