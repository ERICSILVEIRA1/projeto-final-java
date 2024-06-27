import java.io.PrintWriter;

//Atualizei a classe Classcard colocando o if else


public abstract class ClassCard {
    private String name;
    private String description;
    private int attackPoints;
    private int defensePoints;

    public ClassCard(String name, String description, int attackPoints, int defensePoints) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        if (description == null || description.isEmpty()) {
            throw new IllegalArgumentException("Description cannot be null or empty");
        }
        if (attackPoints < 0) {
            throw new IllegalArgumentException("Attack points cannot be negative");
        }
        if (defensePoints < 0) {
            throw new IllegalArgumentException("Defense points cannot be negative");
        }
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
        if (writer == null) {
            throw new IllegalArgumentException("Writer cannot be null");
        }
        writer.println("Card Name: " + name);
        writer.println("Description: " + description);
        writer.println("Attack Points: " + attackPoints);
        writer.println("Defense Points: " + defensePoints);
        writer.println();
    }
}


