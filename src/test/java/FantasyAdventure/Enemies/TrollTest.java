package FantasyAdventure.Enemies;

import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Players.Melee.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    Troll troll;
    Knight knight;

    @Before
    public void before(){
        troll = new Troll(40, 8, 13);
        knight = new Knight("Sir Lancelot", Race.HUMAN, 50, Weapons.SWORD, Protection.ARMOUR);

    }


    @Test
    public void hasHealthPoints() {
        assertEquals(40, troll.getHealthPoints());
    }

    @Test
    public void hasArmour() {
        assertEquals(8, troll.getArmour());
    }

    @Test
    public void getDamage() {
        assertEquals(13, troll.getDamage());
    }

    @Test
    public void canDefendFromAttackWhenDamageMoreThanArmour(){
        troll.defend(25);
        assertEquals(23, troll.getHealthPoints());
    }

    @Test
    public void canDefendFromAttackWhenDamageLessThanArmour(){
        troll.defend(knight.getDamage());
        assertEquals(33, troll.getHealthPoints());
    }

    @Test
    public void canAttack(){
        troll.attack(knight);
        assertEquals(40, troll.getHealthPoints());
    }
}
