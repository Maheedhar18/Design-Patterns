package decorator_pattern;

public class PlainPizza implements Pizza {

    String description = "Thin dough";
    double cost = 4.00;

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }
    
}
