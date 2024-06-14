import java.util.ArrayList;
import java.util.List;

public class Hand {
    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card getCard(int index) {
        if (index < 0 || index >= cards.size()) {
            throw new IndexOutOfBoundsException("Card index invalido");
        }
        return cards.get(index); 
    }

    public int calculatedValue() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calculatedValue'");
    }

}
