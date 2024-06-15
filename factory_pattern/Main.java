package factory_pattern;

import factory_pattern.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory pizzaFactory = new SimplePizzaFactory();
        Pizza pizza=pizzaFactory.orderPizza("Veggie");
        System.out.println(pizza.getDescription());
    }
}
