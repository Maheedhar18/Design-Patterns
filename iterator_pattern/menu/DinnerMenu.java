package iterator_pattern.menu;

import iterator_pattern.MenuItem;
import iterator_pattern.iterator.DinnerMenuIterator;
import iterator_pattern.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu implements Menu{
    List<MenuItem> menuItemList;

    public DinnerMenu() {
        menuItemList=new ArrayList<>();
        menuItemList.add(new MenuItem("Gobi", "Made with cauliflower and sauces", 11));
        menuItemList.add(new MenuItem("Biryani", "Rice with variety of spices", 15));
        menuItemList.add(new MenuItem("Panner Butter masala", "Contains lots of spices gravy and paneer", 14));
    }

    @Override
    public Iterator createIterator() {
        return new DinnerMenuIterator(menuItemList);
    }


}
