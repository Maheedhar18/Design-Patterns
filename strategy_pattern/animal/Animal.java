package strategy_pattern.animal;

import strategy_pattern.flyable.Flyable;
import strategy_pattern.sound.Sound;

public class Animal {
    String name;
    Flyable flyingType;
    Sound soundtype;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlyingType() {
        return flyingType.fly();
    }

    public void setFlyingType(Flyable flyingType) {
        this.flyingType = flyingType;
    }

    public String getSoundtype() {
        return soundtype.makeSound();
    }

    public void setSoundtype(Sound soundtype) {
        this.soundtype = soundtype;
    }
}
