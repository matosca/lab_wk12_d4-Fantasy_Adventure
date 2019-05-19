package FantasyAdventure.Players;

import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Players.Melee.Barbarian;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.rooms.EnemyRoom;
import FantasyAdventure.rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Orc orc;
    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;


    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);
        orc = new Orc(50, 10, 7);
        treasureRoom = new TreasureRoom(1000);
        enemyRoom = new EnemyRoom(140, orc);
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
        barbarian.changeWeapon(Weapons.AXE);
        assertEquals(Weapons.AXE, barbarian.getWeapon());
    }

    @Test
    public void canAttack(){
        barbarian.attack(orc);
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void canDefend(){
        barbarian.defend(orc.getDamage());
        assertEquals(97, barbarian.getHealthPoints());
    }

    @Test
    public void startsOffNullRoom(){
        assertEquals(null, barbarian.getCurrentRoom());
    }

    @Test
    public void canEnterRoom(){
        barbarian.enterRoom(treasureRoom);
        assertEquals(treasureRoom, barbarian.getCurrentRoom());
    }

    @Test
    public void cannotGetCoinsUnlessInRoom(){
        assertEquals(100, barbarian.getCoins());
    }

    @Test
    public void canGetCoinsFromRoom(){
        barbarian.enterRoom(treasureRoom);
        barbarian.getCoins();
        assertEquals(1100, barbarian.getWallet());
    }

    @Test
    public void cannotFightEnemyUnlessInRoom(){
        assertEquals(100, barbarian.getHealthPoints());
    }

    @Test
    public void canFightEnemyInRoom(){
        barbarian.enterRoom(enemyRoom);
        barbarian.fight();
        assertEquals(70, barbarian.getHealthPoints());
        assertEquals(0, orc.getHealthPoints());
    }

}
