import java.io.PrintWriter;

public abstract class Card {
    private String name;
    private String description;
    private int attackPoints;
    private int defensePoints;

    public Card(String name, String description, int attackPoints, int defensePoints) {
        this.name = name;
        this.description = description;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    

    @Override
    public String toString() {
        return "Card [name=" + name + ", description=" + description + ", attackPoints=" + attackPoints
                + ", defensePoints=" + defensePoints + "]";
    }

    protected abstract Card get(int index);

    protected abstract void writeToFile(PrintWriter writer);
}