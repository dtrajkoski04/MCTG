package application.model;


public class SpellCard extends Card {

    public SpellCard(String id, String name, int damage, String elementType) {
        super(id, name, damage, elementType);
    }

    @Override
    public boolean canAttack(Card opponent) {
        // Spells have no restrictions, but effectiveness logic goes in battle system
        return true;
    }
}
