package iterator_pattern.menu;

import iterator_pattern.MenuItem;
import iterator_pattern.iterator.BreakfastMenuIterator;
import iterator_pattern.iterator.Iterator;

public class BreakfastMenu implements Menu{
    MenuItem[] menuItems;

    public BreakfastMenu() {
        menuItems = new MenuItem[3];
        menuItems[0] = new MenuItem("Idly", "Steamed rice cake", 6);
        menuItems[1] = new MenuItem("Dosa", "Thin savoury crepe", 9);
        menuItems[2] = new MenuItem("Maggi", "Thin noodles mixed with spices", 8);
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuIterator(menuItems);
    }



}
