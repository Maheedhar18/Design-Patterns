package template_pattern;

import template_pattern.pizza.MeatPizza;
import template_pattern.pizza.Pizza;
import template_pattern.pizza.VeggiePizza;

// The Template Method Pattern defines the skeleton of an algorithm in a method, deferring some steps to subclasses.
// Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithm’s structure


public class Main {
    public static void main(String[] args) {
        Pizza veggiePizza = new VeggiePizza();
        Pizza meatPizza = new MeatPizza();
        veggiePizza.makePizza();
        meatPizza.makePizza();
    }
}
