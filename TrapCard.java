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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    protected void writeToFile(PrintWriter writer) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeToFile'");
    }
}
