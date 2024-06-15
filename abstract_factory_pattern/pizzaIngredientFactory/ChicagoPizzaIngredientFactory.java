package abstract_factory_pattern.pizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public String cheese() {
        return "Cheddar";
    }

    @Override
    public String sauce() {
        return "Tomato Sauce";
    }
}
