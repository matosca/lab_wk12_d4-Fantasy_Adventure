package FantasyAdventure.Players.Healer;

import FantasyAdventure.Intefaces.IHeal;
import FantasyAdventure.Enums.Items;
import FantasyAdventure.Players.Player;
import FantasyAdventure.Enums.Race;

public abstract class Healer extends Player implements IHeal {

    private Items items;
    private int healingPoints;

    public Healer(String name, Race race, int wallet, Items items) {
        super(name, race, wallet);
        this.items = items;
        this.healingPoints = items.getHealingAmount();
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getHealingPoints() {
        return healingPoints;
    }

    public void heal(Player player){
        int newHealthPoints = player.getHealthPoints() + this.healingPoints;
        player.setHealthPoints(newHealthPoints);
    }

    public void switchItem(Items item) {
        this.items = item;
    }
}
