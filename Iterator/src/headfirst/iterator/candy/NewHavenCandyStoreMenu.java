package headfirst.iterator.candy;

import java.util.ArrayList;


public class NewHavenCandyStoreMenu implements Menu {

	ArrayList menuItems;

	public NewHavenCandyStoreMenu() {
		menuItems = new ArrayList();

		addItem("Liquor Filled Chocolate", 
				"Liquor Filled Chocolate is made which is basically a paste of cocoa melted with raw chocolate to make a bar of fluid chocolate", 
				true,
				10);

		addItem("English Toffee", 
				"English toffee is the epitome of classic toffee. It's rich and buttery, with a firm snap and a crisp texture that doesn't stick to your teeth.", 
				true,
				4.95);

		addItem("Winterfresh Chewing Gum",
				"Get a taste of that cold, alpine freshness anytime with a stick of Winterfresh chewing gum.",
				true,
				6.54);

		addItem("Marshmallow Fudge",
				"Mini marshmallows are melted into this dark chocolate fudge, giving it the smoothest, creamiest texture.",
				true,
				9.50);

		addItem("Cinnabon Candy Cane",
				"Cinnamon Flavored Candy Canes",
				true,
				8.99);
	}

	public void addItem(String name, String description,
			boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new NewHavenCandyStoreMenuIterator(menuItems);
	}

	public String toString() {
		return "Objectville Pancake House Menu";
	}
}

