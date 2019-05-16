package FanatasyAdventure.Enemies;

import FanatasyAdventure.Intefaces.IDefend;

public abstract class Enemy implements IDefend {

    private int healthPoints;
    private int armour;
    private int damage;

    public Enemy(int healthPoints, int armour, int damage) {
        this.healthPoints = healthPoints;
        this.armour = armour;
        this.damage = damage;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getArmour() {
        return armour;
    }

    public int getDamage() {
        return damage;
    }

    public void defend(int damage){
        this.healthPoints -= (damage - armour);
    }

}
