package application.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password; // Hashed in real applications
    private int coins;
    private List<Card> stack; // Collection of all user's cards
    private Deck deck;
    private GameStats stats;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.coins = 20; // Default starting coins
        this.stack = new ArrayList<>();
        this.deck = new Deck();
        this.stats = new GameStats();
    }

    public boolean acquireCard(Card card) {
        return stack.add(card);
    }

    public boolean buyPackage(List<Card> packageCards) {
        if (coins >= 5) {
            stack.addAll(packageCards);
            coins -= 5;
            return true;
        }
        return false;
    }

    public boolean defineDeck(List<Card> cards) {
        if (deck.isValid()) {
            deck = new Deck();
            for (Card card : cards) {
                deck.addCard(card);
            }
            return true;
        }
        return false;
    }

    public int getELO() {
        return stats.getElo();
    }

    public Deck getDeck() {
        return deck;
    }

    public List<Card> getStack() {
        return new ArrayList<>(stack); // Return a copy for safety
    }

}

