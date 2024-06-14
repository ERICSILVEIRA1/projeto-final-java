import java.io.PrintWriter;

public abstract class ClasseCard {
    private String name;
    private String description;
    private int attackPoints;
    private int defensePoints;

    public ClasseCard(String name, String description, int attackPoints, int defensePoints) {
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
    public void writeToFile(PrintWriter writer) {
        writer.println("Card Name: " + name);
        writer.println("Description: " + description);
        writer.println("Attack Points: " + attackPoints);
        writer.println("Defense Points: " + defensePoints);
        writer.println();
    }
    
}

