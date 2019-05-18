package FantasyAdventure.Players;

import FantasyAdventure.Enums.MythicalCreatures;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Spells;
import FantasyAdventure.Players.Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void before(){
        wizard = new Wizard("Potter", Race.HUMAN, 20, Spells.LIGHTNING, MythicalCreatures.HIPPOGRIFF);
    }

    @Test
    public void hasName(){
        assertEquals("Potter", wizard.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, wizard.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(20, wizard.getWallet());
    }

    @Test
    public void hasSpells(){
        assertEquals(Spells.LIGHTNING, wizard.getSpell());
    }

    @Test
    public void hasSpellDamage(){
        assertEquals(13, wizard.getDamage());
    }

    @Test
    public void hasAMythicalCreature(){
        assertEquals(MythicalCreatures.HIPPOGRIFF, wizard.getCreature());
    }

    @Test
    public void hasDefendPointsFromMythicalCreature(){
        assertEquals(16, wizard.getDefendPoints()
        );
    }





}
