package FanatasyAdventure.Players.Melee;

import FanatasyAdventure.Players.Race;
import FanatasyAdventure.Players.Protection;
import FanatasyAdventure.Players.Weapons;

public class Barbarian extends Melee {

    private Protection shield;

    public Barbarian(String name, Race race, int wallet, Weapons weapon, Protection shield) {
        super(name, race, wallet, weapon);
        this.shield = shield;
    }

    public Protection getShield() {
        return shield;
    }


}
