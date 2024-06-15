package abstract_factory_pattern.pizza;


import abstract_factory_pattern.pizzaIngredientFactory.PizzaIngredientFactory;

public abstract class Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory=pizzaIngredientFactory;
    }

    public abstract String getPizza();
}
