import java.io.PrintWriter;

public class SpellCard extends Card {
    private String effect;

    public SpellCard(String name, String description, int attackPoints, int defensePoints, String effect) {
        super(name, description, attackPoints, defensePoints);
        this.effect = effect;
    }

    public String getEffect() {
        return effect;
    }

    @Override
    protected Card get(int index) {
        // Método não implementado para SpellCard
        throw new UnsupportedOperationException("Method 'get' not implemented for SpellCard");
    }

    @Override
    protected void writeToFile(PrintWriter writer) {
        writer.println("Card Type: Spell");
        writer.println("Name: " + getName());
        writer.println("Description: " + getDescription());
        writer.println("Attack Points: " + getAttackPoints());
        writer.println("Defense Points: " + getDefensePoints());
        writer.println("Effect: " + effect);
        writer.println();
    }
}

//Classe Spell card atualizada

