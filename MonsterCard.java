import java.io.PrintWriter;

public class MonsterCard extends Card {
    private int level;

    public MonsterCard(String name, String description, int attackPoints, int defensePoints, int level) {
        super(name, description, attackPoints, defensePoints);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    protected Card get(int index) {
        throw new UnsupportedOperationException("Método 'get' não implementado para MonsterCard");
    }

    @Override
    protected void writeToFile(PrintWriter writer) {
        writer.println("Type: Monster Card");
        writer.println("Name: " + getName());
        writer.println("Description: " + getDescription());
        writer.println("Attack Points: " + getAttackPoints());
        writer.println("Defense Points: " + getDefensePoints());
        writer.println("Level: " + level);
        writer.println(); // Adiciona uma linha em branco para separar as cartas no arquivo
    }

    // Métodos para acessar pontos de ataque e defesa diretamente
    public int getAttack() {
        return getAttackPoints();
    }

    public int getDefense() {
        return getDefensePoints();
    }
}
