package composite_pattern.component;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent{
    List<MenuComponent> menuComponentsList = new ArrayList<>();

    public Menu(String name, String description) {
        super(name, description);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentsList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentsList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentsList.get(index);
    }

    @Override
    public void print() {
        System.out.println("\n"+getName()+" - "+getDescription());
        System.out.println("-----------------------------------");
        for (MenuComponent menuComponent:menuComponentsList) {
            menuComponent.print();
        }
    }
}
