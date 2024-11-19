package application.model;

public class TradeDeal {
    private Card offeredCard;
    private String requiredType; // "Monster" or "Spell"
    private int minimumDamage;

    public TradeDeal(Card offeredCard, String requiredType, int minimumDamage) {
        this.offeredCard = offeredCard;
        this.requiredType = requiredType;
        this.minimumDamage = minimumDamage;
    }

    public boolean isAcceptable(Card offeredCard) {
        boolean matchesType = offeredCard instanceof MonsterCard && "Monster".equals(requiredType)
                || offeredCard instanceof SpellCard && "Spell".equals(requiredType);
        return matchesType && offeredCard.getDamage() >= minimumDamage;
    }

    @Override
    public String toString() {
        return String.format("TradeDeal [Offered: %s, Required: %s with Min Damage: %d]",
                offeredCard, requiredType, minimumDamage);
    }
}
