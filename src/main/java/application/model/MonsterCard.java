package application.model;

public class MonsterCard extends Card {

    public MonsterCard(String id, String name, int damage, String elementType) {
        super(id, name, damage, elementType);
    }

    @Override
    public boolean canAttack(Card opponent) {
        // Implement logic for special monster rules (e.g., Goblin afraid of Dragons)
        if (opponent instanceof MonsterCard && "Dragon".equals(opponent.getName()) && "Goblin".equals(this.getName())) {
            return false;
        }
        return true;
    }
}
