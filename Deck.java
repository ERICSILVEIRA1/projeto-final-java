import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Atualização da classe Deck

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        if (card == null) {
            throw new IllegalArgumentException("Card cannot be null");
        }
        cards.add(card);
    }

    public Card drawCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Cannot draw from an empty deck");
        }
        return cards.remove(0);
    }

    public Card[] getCards() {
        return cards.toArray(new Card[0]);
    }

    public List<Card> drawCards(int numberOfCards) {
        if (numberOfCards < 0 || numberOfCards > cards.size()) {
            throw new IllegalArgumentException("Invalid number of cards to draw");
        }
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            drawnCards.add(drawCard());
        }
        return drawnCards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}