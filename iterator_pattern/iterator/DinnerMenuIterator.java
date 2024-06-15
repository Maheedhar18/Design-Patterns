package iterator_pattern.iterator;

import iterator_pattern.MenuItem;

import java.util.List;

public class DinnerMenuIterator implements Iterator{
    List<MenuItem> menuItemList;
    int position=0;

    public DinnerMenuIterator(List<MenuItem> menuItemList) {
        this.menuItemList = menuItemList;
    }

    @Override
    public boolean hasNext() {
        if (position>=menuItemList.size() || menuItemList.get(position)==null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItemList.get(position);
        position++;
        return menuItem;
    }
}
