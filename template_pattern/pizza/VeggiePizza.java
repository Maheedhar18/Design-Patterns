package template_pattern.pizza;


public class VeggiePizza extends Pizza {
    @Override
    public void addVeggie() {
        System.out.println("Adding Veggies");
    }

    @Override
    public void addMeat() {

    }

    public boolean wantsMeat() {
        return false;
    }
}
