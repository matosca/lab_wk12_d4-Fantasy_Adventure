import FanatasyAdventure.Players.Healer.Paladin;
import FanatasyAdventure.Players.Items;
import FanatasyAdventure.Players.Race;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaladinTest {

    Paladin paladin;

    @Before
    public void before(){
        paladin = new Paladin("Maria", Race.DRAGONBORN, 50, Items.HERBS);
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



}
