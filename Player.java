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
        hand.removeCard(card); // Exemplo simples: remove a carta da mão após jogá-la
    }

    public void setDealer(Dealer dealer) {
        // Implementação opcional, se necessário
    }

    public void printHand() {
        System.out.println(name + "'s hand:");
        for (Card card : hand.getCards()) {
            System.out.println(card);
        }
    }

    public void hit(Deck deck) {
        drawCard();
    }

    public void stand() {
        // Ação de "stand" do jogador (opcional)
    }

    public void doubleDown(Deck deck) {
        // Ação de "double down" do jogador (opcional)
    }

    public void split(Deck deck) {
        // Ação de "split" do jogador (opcional)
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    public void drawCard(Deck d){

    }
}