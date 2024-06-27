import java.io.PrintWriter;

public class TrapCard extends Card {
    private String effect;

    public TrapCard(String name, String description, int attackPoints, int defensePoints, String effect) {
        super(name, description, attackPoints, defensePoints);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    protected Card get(int index) {
        // Método não implementado para TrapCard
        throw new UnsupportedOperationException("Method 'get' not implemented for TrapCard");
    }

    @Override
    protected void writeToFile(PrintWriter writer) {
        writer.println("Card Type: Trap");
        writer.println("Name: " + getName());
        writer.println("Description: " + getDescription());
        writer.println("Attack Points: " + getAttackPoints());
        writer.println("Defense Points: " + getDefensePoints());
        writer.println("Effect: " + effect);
        writer.println();
    }
}