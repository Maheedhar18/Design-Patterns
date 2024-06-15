package iterator_pattern.iterator;

import iterator_pattern.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
