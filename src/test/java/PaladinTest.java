import FanatasyAdventure.Players.Healer.Paladin;
import FanatasyAdventure.Players.Items;
import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaladinTest {

    Paladin paladin;
    Barbarian barbarian;

    @Before
    public void before(){
        paladin = new Paladin("Maria", Race.DRAGONBORN, 50, Items.HERBS);
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);
    }

    @Test
    public void hasName(){
        assertEquals("Maria", paladin.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.DRAGONBORN, paladin.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, paladin.getWallet());
    }

    @Test
    public void hasItem(){
        assertEquals(Items.HERBS, paladin.getItems());
    }

    @Test
    public void canSwitchItems(){
        paladin.switchItem(Items.FOOD);
        assertEquals(Items.FOOD, paladin.getItems());
    }

    @Test
    public void canHeal(){
        paladin.heal(barbarian);
        assertEquals(110, barbarian.getHealthPoints());
    }



}
