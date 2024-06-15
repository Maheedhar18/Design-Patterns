package abstract_factory_pattern.pizza;


import abstract_factory_pattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class ThinPizza extends Pizza {

    public ThinPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public String getPizza() {
        return pizzaIngredientFactory.cheese()+" "+pizzaIngredientFactory.sauce()+" Thin Pizza";
    }
}
