package application.model;

import java.util.ArrayList;
import java.util.List;

public class Package {
    private String id;  // Unique identifier for the package
    private List<Card> cards;

    public Package(String id) {
        this.id = id;
        this.cards = new ArrayList<>();
    }

    public Package(String id, List<Card> cards) {
        this.id = id;
        if (cards.size() != 5) {
            throw new IllegalArgumentException("A package must contain exactly 5 cards.");
        }
        this.cards = new ArrayList<>(cards);
    }

    // Getters
    public String getId() {
        return id;
    }

    public List<Card> getCards() {
        return new ArrayList<>(cards); // Return a copy for safety
    }

    // Remove cards when the package is "opened"
    public List<Card> openPackage() {
        List<Card> openedCards = new ArrayList<>(cards);
        cards.clear(); // Package is consumed
        return openedCards;
    }

    @Override
    public String toString() {
        return String.format("Package [ID: %s, Cards: %s]", id, cards);
    }
}

