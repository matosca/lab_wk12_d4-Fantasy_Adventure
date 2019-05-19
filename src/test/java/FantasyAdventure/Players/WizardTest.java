package FantasyAdventure.Players;

import FantasyAdventure.Enemies.Orc;
import FantasyAdventure.Enemies.Troll;
import FantasyAdventure.Enums.MythicalCreatures;
import FantasyAdventure.Enums.PreciousObjects;
import FantasyAdventure.Enums.Race;
import FantasyAdventure.Enums.Spells;
import FantasyAdventure.Players.Magic.Wizard;
import FantasyAdventure.Rooms.EnemyRoom;
import FantasyAdventure.Rooms.TreasureRoom;
import FantasyAdventure.Rooms.UltimateRoom;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Orc orc;
    Troll troll;
    TreasureRoom treasureRoom;
    EnemyRoom enemyRoom;
    UltimateRoom ultimateRoom;

    @Before
    public void before(){
        wizard = new Wizard("Potter", Race.HUMAN, 20, Spells.LIGHTNING, MythicalCreatures.HIPPOGRIFF);
        orc = new Orc(40, 5, 7);
        troll = new Troll(30, 6, 5);
        treasureRoom = new TreasureRoom(1000);
        enemyRoom = new EnemyRoom(140, orc);
        ultimateRoom = new UltimateRoom(2000, PreciousObjects.GOLDENRING);
    }

    @Test
    public void hasName(){
        assertEquals("Potter", wizard.getName());
    }

    @Test
    public void hasRace(){
        assertEquals(Race.HUMAN, wizard.getRace());
    }

    @Test
    public void hasWallet(){
        assertEquals(20, wizard.getWallet());
    }

    @Test
    public void hasSpells(){
        assertEquals(Spells.LIGHTNING, wizard.getSpell());
    }

    @Test
    public void canChooseADifferentSpell() {
        wizard.changeSpell(Spells.DISINTEGRATE);
        assertEquals(Spells.DISINTEGRATE, wizard.getSpell());
    }

    @Test
    public void hasSpellDamage(){
        assertEquals(13, wizard.getDamage());
    }

    @Test
    public void hasAMythicalCreature(){
        assertEquals(MythicalCreatures.HIPPOGRIFF, wizard.getCreature());
    }

    @Test
    public void hasDefendPointsFromMythicalCreature(){
        assertEquals(16, wizard.getDefendPoints());
    }

    @Test
    public void canAttack(){
        wizard.attack(orc);
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void canDefend(){
        wizard.defend(orc.getDamage());
        assertEquals(91, wizard.getHealthPoints());
    }

    @Test
    public void startsOffNullRoom(){
        assertEquals(null, wizard.getCurrentRoom());
    }

    @Test
    public void canEnterRoom(){
        wizard.enterRoom(treasureRoom);
        assertEquals(treasureRoom, wizard.getCurrentRoom());
    }

    @Test
    public void cannotGetCoinsUnlessInRoom(){
        assertEquals(20, wizard.getCoins());
    }

    @Test
    public void canGetCoinsFromRoom(){
        wizard.enterRoom(treasureRoom);
        wizard.getCoins();
        assertEquals(1020, wizard.getWallet());
    }

    @Test
    public void cannotFightEnemyUnlessInRoom(){
        assertEquals(100, wizard.getHealthPoints());
    }

    @Test
    public void canFightEnemyInRoom(){
        wizard.enterRoom(enemyRoom);
        wizard.fight();
        assertEquals(55, wizard.getHealthPoints());
        assertEquals(0, orc.getHealthPoints());
    }

    @Test
    public void hasABagOfObjectsEmpty(){
        assertEquals(0, wizard.preciousObjectsCount());
    }

    @Test
    public void cannotCollectPreciousObjectUnlessInRoom(){
        assertEquals(0, wizard.preciousObjectsCount());
    }

    @Test
    public void canCollectPreciousObjectFromRoom(){
        wizard.enterRoom(ultimateRoom);
        wizard.collectPreciousObject();
        assertEquals(1, wizard.preciousObjectsCount());
    }

    @Test
    public void getObjectFromBagWhenCollectedObjectFromRoom(){
        wizard.enterRoom(ultimateRoom);
        wizard.collectPreciousObject();
        assertEquals(PreciousObjects.GOLDENRING, wizard.getObjectFromBag());
    }

    @Test
    public void canFightAndDefeatMoreThanOneEnemyInRoom() {
        wizard.enterRoom(ultimateRoom);
        ultimateRoom.addEnemiesToRoom(troll);
        ultimateRoom.addEnemiesToRoom(orc);
        wizard.fightingMultipleEnemies();
        assertEquals(0, troll.getHealthPoints());
        assertEquals(0, orc.getHealthPoints());
        assertEquals(0, wizard.getHealthPoints());
    }
}
