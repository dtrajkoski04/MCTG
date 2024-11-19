package application.model;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public boolean addCard(Card card) {
        if (cards.size() < 4) {  // Maximum of 4 cards in the deck
            cards.add(card);
            return true;
        }
        return false;
    }

    public boolean removeCard(Card card) {
        return cards.remove(card);
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards); // Return a copy for safety
    }

    public boolean isValid() {
        return cards.size() == 4;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
