package headfirst.iterator.candy;
import java.util.ArrayList;

public class ChicagoCandyStoreMenuIterator implements Iterator {
	MenuItem[] items;
	int position = 0;
	
	public ChicagoCandyStoreMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	public Object next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}