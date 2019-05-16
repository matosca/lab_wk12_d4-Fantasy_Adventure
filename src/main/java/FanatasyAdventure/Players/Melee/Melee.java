package FanatasyAdventure.Players.Melee;

import FanatasyAdventure.Intefaces.IDamage;
import FanatasyAdventure.Intefaces.IDefend;
import FanatasyAdventure.Players.Player;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;

public abstract class Melee extends Player implements IDamage, IDefend {

    private Weapons weapon;
    private int damage;
    private Protection protection;

    public Melee(String name, Race race, int wallet, Weapons weapon, Protection protection) {
        super(name, race, wallet);
        this.weapon = weapon;
        this.damage = weapon.getDamage();
        this.protection = protection;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public Protection getProtection(){
        return this.protection;
    }

    public void attack(IDefend enemy ){
        enemy.defend(damage);
    }

    public void defend(int damage){
        setHealthPoints(getHealthPoints() - damage);
    }
}
