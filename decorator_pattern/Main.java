package decorator_pattern;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
    
}
