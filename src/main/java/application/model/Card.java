package application.model;

public abstract class Card {
    private String id;  // Unique identifier for the card
    private String name;
    private int damage;
    private String elementType;  // "Fire", "Water", "Normal"

    public Card(String id, String name, int damage, String elementType) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.elementType = elementType;
    }

    // Getters and Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }

    public String getElementType() { return elementType; }
    public void setElementType(String elementType) { this.elementType = elementType; }

    // Abstract method to handle unique card behaviors
    public abstract boolean canAttack(Card opponent);

    @Override
    public String toString() {
        return String.format("%s [ID: %s, Damage: %d, Element: %s]", name, id, damage, elementType);
    }
}


