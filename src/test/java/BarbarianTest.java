import FanatasyAdventure.Enemies.Orc;
import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Orc orc;


    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);
        orc = new Orc(50, 10, 7);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, barbarian.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(100, barbarian.getWallet());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.SWORD, barbarian.getWeapon());
    }

    @Test
    public void hasProtection(){
        assertEquals(Protection.SHIELD, barbarian.getProtection());
    }

    @Test
    public void hasDamage(){
        assertEquals(15, barbarian.getDamage());
    }

    @Test
    public void canSwitchWeapons(){
        barbarian.setWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, barbarian.getWeapon());
    }






}
