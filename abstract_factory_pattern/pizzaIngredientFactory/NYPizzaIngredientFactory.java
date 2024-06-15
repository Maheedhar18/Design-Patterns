package abstract_factory_pattern.pizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public String cheese() {
        return "Mozzarella";
    }

    @Override
    public String sauce() {
        return "Marinara Sauce";
    }
}
