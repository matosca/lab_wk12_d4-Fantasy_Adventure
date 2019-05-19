package FantasyAdventure.Players;

import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Enemies.Troll;
import FantasyAdventure.Enums.PreciousObjects;
import FantasyAdventure.Players.Melee.Barbarian;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Rooms.EnemyRoom;
import FantasyAdventure.Rooms.TreasureRoom;
import FantasyAdventure.Rooms.UltimateRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Orc orc;
    Troll troll;
    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;
    UltimateRoom ultimateRoom;


    @Before
    public void before(){
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);
        orc = new Orc(40, 10, 13);
        troll = new Troll(30, 10, 10);
        treasureRoom = new TreasureRoom(1000);
        enemyRoom = new EnemyRoom(140, orc);
        ultimateRoom = new UltimateRoom(2000, PreciousObjects.RUBY);
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

    @Test
    public void hasABagOfObjectsEmpty(){
        assertEquals(0, barbarian.preciousObjectsCount());
    }

    @Test
    public void cannotCollectPreciousObjectUnlessInRoom(){
        assertEquals(0, barbarian.preciousObjectsCount());
    }

    @Test
    public void canCollectPreciousObjectFromRoom(){
        barbarian.enterRoom(ultimateRoom);
        barbarian.collectPreciousObject();
        assertEquals(1, barbarian.preciousObjectsCount());
    }

    @Test
    public void getObjectFromBagWhenCollectedObjectFromRoom(){
        barbarian.enterRoom(ultimateRoom);
        barbarian.collectPreciousObject();
        assertEquals(PreciousObjects.RUBY, barbarian.getObjectFromBag());
    }

    @Test
    public void canFightAndDefeatMoreThanOneEnemyInRoom() {
        barbarian.enterRoom(ultimateRoom);
        ultimateRoom.addEnemiesToRoom(troll);
        ultimateRoom.addEnemiesToRoom(orc);
        barbarian.fightingMultipleEnemies();
        assertEquals(0, troll.getHealthPoints());
        assertEquals(0, orc.getHealthPoints());
        assertEquals(76, barbarian.getHealthPoints());
    }

}
