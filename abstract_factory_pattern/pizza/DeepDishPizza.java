package abstract_factory_pattern.pizza;

import abstract_factory_pattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class DeepDishPizza extends Pizza{

    public DeepDishPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        super(pizzaIngredientFactory);
    }

    @Override
    public String getPizza() {
        return pizzaIngredientFactory.cheese()+" "+pizzaIngredientFactory.sauce()+" Deep Dish Pizza";
    }
}
