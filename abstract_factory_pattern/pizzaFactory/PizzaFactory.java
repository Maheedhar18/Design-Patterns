package abstract_factory_pattern.pizzaFactory;

import abstract_factory_pattern.pizza.Pizza;

public interface PizzaFactory {
    Pizza orderPizza(String type);
}
