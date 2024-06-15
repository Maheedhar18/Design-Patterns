package strategy_pattern.flyable;

public class CanNotFly implements Flyable {
    public String fly() {
        return "Cannot fly";
    }
}
