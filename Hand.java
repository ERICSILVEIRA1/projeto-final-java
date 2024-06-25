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
            throw new IndexOutOfBoundsException("Card index inválido");
        }
        return cards.get(index);
    }

    public int calculatedValue() {
        int value = 0;
        int aces = 0;

        for (Card card : cards) {
            int cardValue = getCardValue(card);
            if (card.getRank().equals("Ace")) {
                aces++;
            } else {
                value += cardValue;
            }
        }

        // Consider Ace as 11 if it doesn't bust the hand
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
        String rank = card.getRank();
        switch (rank) {
            case "2": case "3": case "4": case "5": case "6":
            case "7": case "8": case "9": case "10":
                return Integer.parseInt(rank);
            case "Jack": case "Queen": case "King":
                return 10;
            case "Ace":
                return 0; // Ace handled separately in calculatedValue
            default:
                throw new IllegalArgumentException("Invalid card rank: " + rank);
        }
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    public Card drawCard() {
        if (cards.isEmpty())/*Remove o elemento no índice 0 da lista cards. Esse índice representa a primeira posição na lista. */ {
            throw new IllegalStateException("No cards left in the hand");
        }
        return cards.remove(0);/*Retorna o objeto Card que foi removido da lista. */
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards);
    }

    public int getCardCount() {
        return cards.size();
    }
}

// Classe Card para complementar
class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

// Classe MonsterCard para complementar
class MonsterCard extends Card {
    private int attackPoints;
    private int defensePoints;

    public MonsterCard(String rank, String suit, int attackPoints, int defensePoints) {
        super(rank, suit);
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    @Override
    public String toString() {
        return super.toString() + " (ATK: " + attackPoints + ", DEF: " + defensePoints + ")";
    }
}
