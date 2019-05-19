package FantasyAdventure.Players;

import FantasyAdventure.Enemies.Troll;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Players.Melee.Knight;
import FantasyAdventure.rooms.EnemyRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Troll troll;
    EnemyRoom enemyRoom;

    @Before
    public void before(){
        knight = new Knight("Sir Lancelot", Race.HUMAN, 50, Weapons.SWORD, Protection.ARMOUR);
        troll = new Troll(40, 8, 20);
        enemyRoom = new EnemyRoom(140, troll);
    }


    @Test
    public void hasHealthPoints(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void hasName(){
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, knight.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(50, knight.getWallet());
    }

    @Test
    public void hasWeapon(){
        assertEquals(Weapons.SWORD, knight.getWeapon());
    }

    @Test
    public void hasProtection(){
        assertEquals(Protection.ARMOUR, knight.getProtection());
    }

    @Test
    public void hasDamage(){
        assertEquals(15, knight.getDamage());
    }

    @Test
    public void canSwitchWeapons(){
        knight.changeWeapon(Weapons.MACE);
        assertEquals(Weapons.MACE, knight.getWeapon());
    }

    @Test
    public void canAttack(){
        knight.attack(troll);
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void canDefend(){
        knight.defend(troll.getDamage());
        assertEquals(92, knight.getHealthPoints());
    }

    @Test
    public void startsOffNullRoom(){
        assertEquals(null, knight.getCurrentRoom());
    }

    @Test
    public void canEnterRoom(){
        knight.enterRoom(enemyRoom);
        assertEquals(enemyRoom, knight.getCurrentRoom());
    }

    @Test
    public void cannotGetCoinsUnlessInRoom(){
        assertEquals(50, knight.getCoins());
    }

    @Test
    public void canGetCoinsFromRoom(){
        knight.enterRoom(enemyRoom);
        knight.getCoins();
        assertEquals(190, knight.getWallet());
    }

    @Test
    public void cannotFightEnemyUnlessInRoom(){
        assertEquals(100, knight.getHealthPoints());
    }

    @Test
    public void canFightEnemyInRoom(){
        knight.enterRoom(enemyRoom);
        knight.fight();
        assertEquals(92, knight.getHealthPoints());
    }
}
