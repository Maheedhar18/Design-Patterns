package decorator_pattern;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza tempPizza) {
        this.tempPizza=tempPizza;
    }

    public String getDescription()
    {
        return tempPizza.getDescription()+" mozarella";
    }

    public double getCost()
    {
        return tempPizza.getCost()+2.00;
    }
    
}
