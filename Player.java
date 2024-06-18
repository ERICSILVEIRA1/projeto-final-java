public class Player {
    private String name;
    private Deck deck;
    private Hand hand;
    private int lifePoints;

    public Player(String name) {
        this.name = name;
        this.deck = new Deck();
        this.hand = new Hand();
        this.lifePoints = 8000;
    }

    public String getName() {
        return name;
    }

    public Deck getDeck() {
        return deck;
    }

    public Hand getHand() {
        return hand;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void drawCard() {
        Card card = deck.drawCard();
        hand.addCard(card);
    }

    public void playCard(Card card) {
        // Implementar lógica para jogar cartas
    }

    public void drawCard(Deck deck2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drawCard'");
    }

    public void setDealer(Dealer dealer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDealer'");
    }

    public void printHand() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'printHand'");
    }

    public void hit(Deck deck2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'hit'");
    }

    public void stand() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'stand'");
    }

    public void doubleDown(Deck deck2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doubleDown'");
    }

    public void split(Deck deck2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'split'");
    }

    public void setHand(Hand hand2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setHand'");
    }
}

