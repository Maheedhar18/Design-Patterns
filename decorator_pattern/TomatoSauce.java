package decorator_pattern;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Added Tomato Sauce");
    }

    public String getDescription()
    {
        return tempPizza.getDescription()+" tomato sauce";
    }

    public double getCost()
    {
        return tempPizza.getCost()+0.50;
    }
    
}
