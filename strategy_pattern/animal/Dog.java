package strategy_pattern.animal;

import strategy_pattern.flyable.CanNotFly;
import strategy_pattern.sound.Bark;

public class Dog extends Animal{
    public Dog() {
        super();
        setFlyingType(new CanNotFly());
        setSoundtype(new Bark());
    }
}
