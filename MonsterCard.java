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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    protected void writeToFile(PrintWriter writer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToFile'");
    }
}
