package FantasyAdventure.Players;

import FantasyAdventure.Enums.MythicalCreatures;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Spells;
import FantasyAdventure.Players.Magic.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void before(){
        warlock = new Warlock("Wordruk", Race.DWARF, 35, Spells.SCORCHINGRAY, MythicalCreatures.BASILISK);
    }

    @Test
    public void hasName(){
        assertEquals("Wordruk", warlock.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.DWARF, warlock.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(35, warlock.getWallet());
    }

    @Test
    public void hasSpells(){
        assertEquals(Spells.SCORCHINGRAY, warlock.getSpell());
    }

    @Test
    public void hasSpellDamage(){
        assertEquals(17, warlock.getDamage());
    }

    @Test
    public void hasAMythicalCreature(){
        assertEquals(MythicalCreatures.BASILISK, warlock.getCreature());
    }

    @Test
    public void hasDefendPointsFromMythicalCreature(){
        assertEquals(12, warlock.getDefendPoints()
        );
    }

}
