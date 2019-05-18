package FantasyAdventure.Players.Magic;

import FantasyAdventure.Enums.MythicalCreatures;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Spells;
import FantasyAdventure.Players.Player;

public abstract class Magic extends Player {

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

    public int getDamage() {
        return damage;
    }

    public MythicalCreatures getCreature() {
        return creature;
    }

    public int getDefendPoints() {
        return defendPoints;
    }
}
