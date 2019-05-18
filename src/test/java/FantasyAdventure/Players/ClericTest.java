package FantasyAdventure.Players;

import FantasyAdventure.Enums.Items;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Players.Healer.Cleric;
import FantasyAdventure.Players.Melee.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Knight knight;

    @Before
    public void before(){
        cleric = new Cleric("Vanidur", Race.ELF, 30, Items.POTION);
        knight = new Knight("Sir Lancelot", Race.HUMAN, 50, Weapons.SWORD, Protection.ARMOUR);

    }


    @Test
    public void hasName(){
        assertEquals("Vanidur", cleric.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.ELF, cleric.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(30, cleric.getWallet());
    }

    @Test
    public void hasItem(){
        assertEquals(Items.POTION, cleric.getItems());
    }

    @Test
    public void canSwitchItems(){
        cleric.switchItem(Items.HERBS);
        assertEquals(Items.HERBS, cleric.getItems());
    }

    @Test
    public void canHeal(){
        cleric.heal(knight);
        assertEquals(120, knight.getHealthPoints());
    }
}
