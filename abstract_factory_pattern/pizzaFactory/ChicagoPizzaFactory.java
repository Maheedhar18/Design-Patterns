package abstract_factory_pattern.pizzaFactory;

import abstract_factory_pattern.pizza.DeepDishPizza;
import abstract_factory_pattern.pizza.Pizza;
import abstract_factory_pattern.pizzaIngredientFactory.ChicagoPizzaIngredientFactory;
import abstract_factory_pattern.pizzaIngredientFactory.NYPizzaIngredientFactory;
import abstract_factory_pattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class ChicagoPizzaFactory implements PizzaFactory{
    Pizza pizza;

    @Override
    public Pizza orderPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory=new ChicagoPizzaIngredientFactory();
        if (type.equals("Deep Dish")) {
            pizza=new DeepDishPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
