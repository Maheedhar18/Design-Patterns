package composite_pattern;

import composite_pattern.component.Menu;
import composite_pattern.component.MenuComponent;
import composite_pattern.component.MenuItem;

// The Composite Pattern allows you to compose objects into tree structures to represent part-whole hierarchies.
// Composite lets clients treat individual objects and compositions of objects uniformly.

public class Main {
    public static void main(String[] args) {
        MenuComponent breakfast = new Menu("Breakfast Menu", "breakfast");
        MenuComponent dinner = new Menu("Dinner Menu", "dinner");
        MenuComponent dessert = new Menu("Desset Menu", "desserts");
        MenuComponent dosa = new MenuItem("dosa", "Thin savoury crepe");
        MenuComponent idly = new MenuItem("idly", "steamed rice cake");
        breakfast.add(idly);
        breakfast.add(dosa);
        MenuComponent gobi = new MenuItem("Gobi", "Made with cauliflower and sauces");
        MenuComponent biryani = new MenuItem("Biryani", "Rice with variety of spices");
        dinner.add(gobi);
        dinner.add(biryani);
        MenuComponent cake = new MenuItem("cake", "Strawberry flavour");
        dessert.add(cake);
        dinner.add(dessert);
        MenuComponent allMenus = new Menu("All Menus", "List of all Menus");
        allMenus.add(breakfast);
        allMenus.add(dinner);
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
