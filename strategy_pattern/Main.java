package strategy_pattern;

// The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.

import strategy_pattern.animal.Animal;
import strategy_pattern.animal.Dog;
import strategy_pattern.animal.Duck;
import strategy_pattern.sound.Quack;
import strategy_pattern.flyable.canFly;

public class Main {
    public static void main(String[] args) {
        Animal dog=new Dog();
        Animal duck=new Duck();
        System.out.println("Dog characteristics : "+dog.getFlyingType()+" and makes Sound "+dog.getSoundtype());
        System.out.println("Duck characteristics : "+duck.getFlyingType()+" and makes Sound "+duck.getSoundtype());
        dog.setFlyingType(new canFly());
        dog.setSoundtype(new Quack());
        System.out.println("Dog characteristics : "+dog.getFlyingType()+" and makes Sound "+dog.getSoundtype());
    }
}
