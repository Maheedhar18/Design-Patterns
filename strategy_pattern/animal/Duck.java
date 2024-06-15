package strategy_pattern.animal;

import strategy_pattern.sound.Quack;
import strategy_pattern.flyable.canFly;

public class Duck extends Animal{
    public Duck() {
        super();
        setFlyingType(new canFly());
        setSoundtype(new Quack());
    }
}
