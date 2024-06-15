package iterator_pattern;

import iterator_pattern.iterator.DinnerMenuIterator;
import iterator_pattern.iterator.Iterator;
import iterator_pattern.menu.BreakfastMenu;
import iterator_pattern.menu.DinnerMenu;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Waitress {
    BreakfastMenu breakfastMenu;
    DinnerMenu dinnerMenu;

    public Waitress(DinnerMenu dinnerMenu, BreakfastMenu breakfastMenu) {
        this.dinnerMenu = dinnerMenu;
        this.breakfastMenu = breakfastMenu;
    }

    public void printMenu() {
        Iterator dinnerMenuIterator = dinnerMenu.createIterator();
        Iterator breakfastMenuIterator = breakfastMenu.createIterator();
        System.out.println("Breakfast Menu:");
        printMenu(breakfastMenuIterator);
        System.out.println("Dinner Menu:");
        printMenu(dinnerMenuIterator);
    }

    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName()+"-"+menuItem.getDescription()+" "+menuItem.getPrice()+"$");
        }
    }
}
