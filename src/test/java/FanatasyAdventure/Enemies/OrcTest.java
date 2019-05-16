package FanatasyAdventure.Enemies;

import FanatasyAdventure.Players.Melee.Barbarian;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Weapons;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    Orc orc;
    Barbarian barbarian;

    @Before
    public void before() {
        orc = new Orc(50, 8, 10);
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);

    }

    @Test
    public void hasHealthPoints() {
        assertEquals(50, orc.getHealthPoints());
    }

    @Test
    public void hasArmour() {
        assertEquals(8, orc.getArmour());
    }

    @Test
    public void getDamage() {
        assertEquals(10, orc.getDamage());
    }

    @Test
    public void canDefendFromAttackWhenDamageMoreThanArmour(){
        orc.defend(25);
        assertEquals(33, orc.getHealthPoints());
    }

    @Test
    public void canDefendFromAttackWhenDamageLessThanArmour(){
        orc.defend(barbarian.getDamage());
        assertEquals(49, orc.getHealthPoints());
    }

    @Test
    public void canAttack(){
        orc.attack(barbarian);
        assertEquals(50, orc.getHealthPoints());
    }
}