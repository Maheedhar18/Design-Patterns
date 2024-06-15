package decorator_pattern;

public class TomatoSauce extends ToppingDecorator {

    public TomatoSauce(Pizza tempPizza) {
        this.tempPizza=tempPizza;
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
