package FantasyAdventure.Players.Magic;

import FantasyAdventure.Enemies.Enemy;
import FantasyAdventure.Enums.MythicalCreatures;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Spells;
import FantasyAdventure.Intefaces.IDamage;
import FantasyAdventure.Intefaces.IDefend;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Rooms.Room;

import java.util.ArrayList;

public abstract class Magic extends Player implements IDamage, IDefend {

    private Spells spell;
    private int damage;
    private MythicalCreatures creature;
    private int defendPoints;

    public Magic(String name, Race race, int wallet, Spells spell, MythicalCreatures creature) {
        super(name, race, wallet);
        this.spell = spell;
        this.damage = spell.getDamage();
        this.creature = creature;
        this.defendPoints = creature.getDefendPoints();
    }

    public Spells getSpell() {
        return spell;
    }

    public void changeSpell(Spells spell) {
        this.spell = spell;
    }

    public int getDamage() {
        return damage;
    }

    public MythicalCreatures getCreature() {
        return creature;
    }

    public int getDefendPoints() {
        return defendPoints;
    }

    @Override
    public void attack(IDefend enemy) {
        enemy.defend(damage);
    }

    public void defend(int damage) {
        int initialDamage = defendPoints - damage;

        if (initialDamage > 0 ) {
            setHealthPoints(getHealthPoints() - initialDamage);
        }
        else {
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

    public void fightingMultipleEnemies() {
        if (getCurrentRoom() != null) {
            Room room = getCurrentRoom();
            ArrayList<Enemy> enemies = room.getEnemies();
            for (Enemy enemy : enemies) {
                while(enemy.getHealthPoints() > 0) {
                    attack(enemy);
                    defend(enemy.getDamage());
                    if(enemy.getHealthPoints() < 0) {
                        enemy.setHealthPoints(0);
                    }
                }
            }
        }
    }
}
