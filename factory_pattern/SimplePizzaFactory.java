package factory_pattern;

import factory_pattern.pizza.CheesePizza;
import factory_pattern.pizza.Pizza;
import factory_pattern.pizza.VeggiePizza;

public class SimplePizzaFactory {
    Pizza pizza;

    public Pizza orderPizza(String name) {
        if (name.equals("Cheese")) {
            pizza=new CheesePizza();
        } else if (name.equals("Veggie")) {
            pizza=new VeggiePizza();
        }
        return pizza;
    }
}
