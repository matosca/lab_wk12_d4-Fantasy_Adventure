package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Troll;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Players.Melee.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnemyRoomTest {

    EnemyRoom enemyRoom;
    Troll troll;
    Knight knight;

    @Before
    public void before(){
        troll = new Troll(40, 8, 13);
        enemyRoom = new EnemyRoom(140, troll);
        knight = new Knight("Sir Lancelot", Race.HUMAN, 50, Weapons.SWORD, Protection.ARMOUR);
    }

    @Test
    public void hasCoins(){
        assertEquals(140, enemyRoom.getCoins());
    }

    @Test
    public void thereIsEnemyIn(){
        assertEquals(troll, enemyRoom.getEnemy());
    }

    @Test
    public void startsWithNoPlayer(){
        assertEquals(null, enemyRoom.getPlayer());
    }

    @Test
    public void canSetPlayer(){
        enemyRoom.setPlayer(knight);
        assertEquals(knight, enemyRoom.getPlayer());
    }

}
