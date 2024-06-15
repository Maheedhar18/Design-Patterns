package iterator_pattern;

import iterator_pattern.menu.BreakfastMenu;
import iterator_pattern.menu.DinnerMenu;

// The Iterator Pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

public class Main {
    public static void main(String[] args) {
        BreakfastMenu breakfastMenu = new BreakfastMenu();
        DinnerMenu dinnerMenu = new DinnerMenu();
        Waitress waitress = new Waitress(dinnerMenu, breakfastMenu);
        waitress.printMenu();
    }
}
