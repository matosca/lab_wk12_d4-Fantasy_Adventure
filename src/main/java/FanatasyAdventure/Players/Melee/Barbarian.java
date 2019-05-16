package FanatasyAdventure.Players.Melee;

import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Shields;
import FanatasyAdventure.Players.Weapons;

public class Barbarian extends Melee {

    private Shields shield;

    public Barbarian(String name, Race race, int wallet, Weapons weapon, Shields shield) {
        super(name, race, wallet, weapon);
        this.shield = shield;
    }

    public Shields getShield() {
        return shield;
    }


}
