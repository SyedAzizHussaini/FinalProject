package headfirst.iterator.candy;
import java.util.ArrayList;

public class ChicagoCandyStoreMenu implements Menu {
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;

	public ChicagoCandyStoreMenu() {
		menuItems = new MenuItem[MAX_ITEMS];

		addItem("Milk Chocolate", 
				"Milk chocolate is a solid chocolate confectionery containing cocoa, sugar and milk.", 
				true,
				4.45);

		addItem("Bubble Mint Sugar Free Gum", 
				"Bubblemint Sugarfree Chewing Gum is made with a delicious bubblemint flavor for a clean and fresh feeling", 
				true,
				2.10);

		addItem("Veg Marshmallow",
				"Soft and mildly flavoured cubes of marshmallow\r\n" + 
						"100% Vegan Confectionery",
						true,
						7.2);

		addItem("Almond Butter Crunch",
				"The sweet buttery crunch of this delicious Buttercrunch Toffee is paired with chocolate and toasted almonds for a winning combination.",
				true,
				6.59);

		addItem("Chocolate Mint Candy Cane",
				"peppermint flavor as the originals, but they also sport a festive, chocolate stripe.",
				true,
				3.25);
	}

	public void addItem(String name, String description, 
			boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full!  Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return new ChicagoCandyStoreMenuIterator(menuItems);
	}

	// other menu methods here
}
