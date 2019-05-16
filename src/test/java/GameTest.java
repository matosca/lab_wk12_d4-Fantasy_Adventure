import FanatasyAdventure.Enemies.Orc;
import FanatasyAdventure.Players.Healer.Paladin;
import FanatasyAdventure.Players.Items;
import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Barbarian barbarian;
    Orc orc;
    Paladin paladin;

    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);
        orc = new Orc(50, 8, 10);
        paladin = new Paladin("Choc", Race.DRAGONBORN, 2, Items.POTION);
    }

    @Test
    public void canAttack(){
        barbarian.attack(orc);
        assertEquals(43, orc.getHealthPoints());
    }

    @Test
    public void canHeal(){
        paladin.heal(barbarian);
        assertEquals(120, barbarian.getHealthPoints());
    }


}
