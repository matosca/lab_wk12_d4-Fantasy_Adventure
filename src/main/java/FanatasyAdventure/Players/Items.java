package FanatasyAdventure.Players;

public enum Items {

    POTION(20),
    HERBS(10),
    FOOD(10);

    private int healingAmount;

    Items(int healingAmount) {
        this.healingAmount = healingAmount;
    }

    public int getHealingAmount() {
        return healingAmount;
    }
}
