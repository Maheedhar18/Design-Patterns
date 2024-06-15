package template_pattern.pizza;

public class MeatPizza extends Pizza{
    @Override
    public void addVeggie() {

    }

    @Override
    public void addMeat() {
        System.out.println("Adding meat");
    }

    public boolean wantsVeggie() {
        return false;
    }
}
