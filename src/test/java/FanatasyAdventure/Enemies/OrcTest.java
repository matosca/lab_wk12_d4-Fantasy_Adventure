package FanatasyAdventure.Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OrcTest {

    Orc orc;

    @Before
    public void before() {
        orc = new Orc(50, 8, 10);
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
}