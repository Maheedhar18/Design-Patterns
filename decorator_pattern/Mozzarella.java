package decorator_pattern;

public class Mozzarella extends ToppingDecorator{

    public Mozzarella(Pizza tempPizza) {
        super(tempPizza);
        System.out.println("Added mozarella");
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
