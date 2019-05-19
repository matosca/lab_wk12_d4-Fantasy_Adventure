package FantasyAdventure.Players.Melee;

import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Intefaces.IDamage;
import FantasyAdventure.Intefaces.IDefend;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Rooms.Room;

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

    public void changeWeapon(Weapons weapon) {
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

        int initialDamage = protection.getArmourRating() - damage;

        if (initialDamage > 0) {
            setHealthPoints(getHealthPoints() - initialDamage);
        } else {
            setHealthPoints(getHealthPoints() + initialDamage);
        }
    }

    public void fight(){
        if (getCurrentRoom() != null) {
            Room room = getCurrentRoom();
            Enemy enemy = room.getEnemy();
            while (enemy.getHealthPoints() > 0) {
                attack(enemy);
                defend(enemy.getDamage());
                if (enemy.getHealthPoints() < 0) {
                    enemy.setHealthPoints(0);
                }
            }
        }
    }
}
