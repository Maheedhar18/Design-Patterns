package abstract_factory_pattern;

import abstract_factory_pattern.pizza.Pizza;
import abstract_factory_pattern.pizzaFactory.ChicagoPizzaFactory;
import abstract_factory_pattern.pizzaFactory.NYPizzaFactory;

public class Main {
    public static void main(String[] args) {
        NYPizzaFactory nyPizzaFactory=new NYPizzaFactory();
        Pizza nyPizza=nyPizzaFactory.orderPizza("Thin");
        System.out.println(nyPizza.getPizza());
        ChicagoPizzaFactory chicagoPizzaFactory=new ChicagoPizzaFactory();
        Pizza chicagoPizza=chicagoPizzaFactory.orderPizza("Deep Dish");
        System.out.println(chicagoPizza.getPizza());
    }
}
