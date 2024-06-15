package iterator_pattern.iterator;

import iterator_pattern.MenuItem;

public class BreakfastMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public BreakfastMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position>=menuItems.length || menuItems[position]==null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
