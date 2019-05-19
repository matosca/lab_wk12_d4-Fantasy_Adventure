package FantasyAdventure.Rooms;

import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Enemies.Troll;
import FantasyAdventure.Enums.PreciousObjects;
import FantasyAdventure.Enums.Protection;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Weapons;
import FantasyAdventure.Players.Melee.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UltimateRoomTest {

    UltimateRoom ultimateRoom;
    Troll troll;
    Orc orc;
    Barbarian barbarian;

    @Before
    public void before(){
        ultimateRoom = new UltimateRoom(20, PreciousObjects.RUBY);
        troll = new Troll(30, 10, 10);
        orc = new Orc(40, 6, 9);
        barbarian = new Barbarian("Conan", Race.HOBBIT, 100, Weapons.MACE, Protection.SHIELD);
    }

    @Test
    public void hasCoins() {
        assertEquals(20, ultimateRoom.getCoins());
    }

    @Test
    public void hasPreciousObject() {
        assertEquals(PreciousObjects.RUBY, ultimateRoom.getObject());
    }

    @Test
    public void preciousObjectHasAValue() {
        assertEquals(5, ultimateRoom.getObject().getValue());
    }

    @Test
    public void startsWithNoEnemiesInRoom() {
        assertEquals(0, ultimateRoom.enemiesCount());
    }

    @Test
    public void hasEnemiesInRoom() {
        ultimateRoom.addEnemiesToRoom(troll);
        ultimateRoom.addEnemiesToRoom(orc);
        assertEquals(2, ultimateRoom.enemiesCount());
    }

    @Test
    public void startsWithNoPlayer(){
        assertEquals(null, ultimateRoom.getPlayer());
    }

    @Test
    public void canSetPlayer(){
        ultimateRoom.setPlayer(barbarian);
        assertEquals(barbarian, ultimateRoom.getPlayer());
    }
}
