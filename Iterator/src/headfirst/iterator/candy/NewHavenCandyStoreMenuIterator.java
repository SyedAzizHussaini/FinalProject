package headfirst.iterator.candy;
import java.util.ArrayList;

public class NewHavenCandyStoreMenuIterator implements Iterator {
	ArrayList items;
	int position = 0;

	public NewHavenCandyStoreMenuIterator(ArrayList items) {
		this.items = items;
	}

	public Object next() {
		Object object = items.get(position);
		position = position + 1;
		return object;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}