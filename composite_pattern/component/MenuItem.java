package composite_pattern.component;

public class MenuItem extends MenuComponent{

    public MenuItem(String name, String description) {
        super(name, description);
    }

    public void print() {
        System.out.println(getName()+" - "+getDescription());
    }
}
