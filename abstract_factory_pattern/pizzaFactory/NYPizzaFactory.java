package abstract_factory_pattern.pizzaFactory;

import abstract_factory_pattern.pizza.DeepDishPizza;
import abstract_factory_pattern.pizza.Pizza;
import abstract_factory_pattern.pizza.ThinPizza;
import abstract_factory_pattern.pizzaIngredientFactory.NYPizzaIngredientFactory;
import abstract_factory_pattern.pizzaIngredientFactory.PizzaIngredientFactory;

public class NYPizzaFactory implements PizzaFactory{
    Pizza pizza;

    @Override
    public Pizza orderPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory=new NYPizzaIngredientFactory();
        if (type.equals("Thin")) {
            pizza=new ThinPizza(pizzaIngredientFactory);
        }
        return pizza;
    }
}
