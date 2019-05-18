package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Players.Melee.Barbarian;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.rooms.TreasureRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TreasureRoomTest {

    TreasureRoom treasureRoom;
    Orc orc;
    Barbarian barbarian;

    @Before
    public void before(){
        treasureRoom = new TreasureRoom(1000);
        orc = new Orc(50, 8, 10);
        barbarian = new Barbarian("Conan", Race.HUMAN, 100, Weapons.SWORD, Protection.SHIELD);

    }

    @Test
    public void hasCoins(){
        assertEquals(1000, treasureRoom.getCoins());
    }

    @Test
    public void startsWithNoEnemy(){
        assertEquals(null, treasureRoom.getEnemy());
    }

    @Test
    public void startsWithNoPlayer(){
        assertEquals(null, treasureRoom.getPlayer());
    }

    @Test
    public void canSetEnemy(){
        treasureRoom.setEnemy(orc);
        assertEquals(orc, treasureRoom.getEnemy());
    }

    @Test
    public void canSetPlayer(){
        treasureRoom.setPlayer(barbarian);
        assertEquals(barbarian, treasureRoom.getPlayer());
    }
}
