import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public Hand(List<Card> cards) {
        this.cards = new ArrayList<>(cards);
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCard(int index) {
        if (index < 0 || index >= cards.size()) {
            throw new IndexOutOfBoundsException("Índice de carta inválido: " + index);
        }
        return cards.get(index);
    }

    public int calculatedValue() {
        int value = 0;
        int aces = 0;

        for (Card card : cards) {
            int cardValue = getCardValue(card);
            if (card.getName().equals("Ace")) {
                aces++;
            } else {
                value += cardValue;
            }
        }

        // Considerar Ace como 11 se não estourar a mão
        for (int i = 0; i < aces; i++) {
            if (value + 11 <= 21) {
                value += 11;
            } else {
                value += 1;
            }
        }

        return value;
    }

    private int getCardValue(Card card) {
        String rank = String.valueOf(card.getAttackPoints());

        switch (rank) {
            case "2": case "3": case "4": case "5": case "6":
            case "7": case "8": case "9": case "10":
                return Integer.parseInt(rank);
            case "Jack": case "Queen": case "King":
                return 10;
            case "Ace":
                return 0; // Ace é tratado separadamente em calculatedValue
            default:
                throw new IllegalArgumentException("Rank de carta inválido: " + rank);
        }
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Não há cartas na mão");
        }
        return cards.remove(0);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public int getCardCount() {
        return cards.size();
    }
    public Card removeCard(Card c){
        return this.getCard(getCardCount());
    }
}
