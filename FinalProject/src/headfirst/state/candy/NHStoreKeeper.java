package headfirst.state.candy;


public class NHStoreKeeper {

	NewHavenCandyStoreMenu newHavenCandyStoreMenu;	
		
		public NHStoreKeeper(NewHavenCandyStoreMenu newHavenCandyStoreMenu) {
			this.newHavenCandyStoreMenu = newHavenCandyStoreMenu;
			
		}
	 
		public void nhPrintMenu() {
			Iterator nhIterator = newHavenCandyStoreMenu.createIterator();
			System.out.println("\t\t\tMENU\n\t\t\t----\nNew Haven's Candy Store Menu\n----------- ----");
			printMenu(nhIterator);
		}
		
	 
		private void printMenu(Iterator iterator) {
			while (iterator.hasNext()) {
				System.out.println("");
				MenuItem menuItem = (MenuItem)iterator.next();
				System.out.print(menuItem.getName() + ": ");
				System.out.print(menuItem.getDescription());
				System.out.println("\n $"+menuItem.getPrice());
			}
			System.out.println("");
		}
	 
		public void printVegetarianMenu() {
			printVegetarianMenu(newHavenCandyStoreMenu.createIterator());
					}
	 
		public boolean isItemVegetarian(String name) {
			Iterator lunchIterator = newHavenCandyStoreMenu.createIterator();
			if (isVegetarian(name, lunchIterator)) {
				return true;
			}
			return false;
		}


		private void printVegetarianMenu(Iterator iterator) {
			while (iterator.hasNext()) {
				MenuItem menuItem = (MenuItem)iterator.next();
				if (menuItem.isVegetarian()) {
					System.out.print(menuItem.getName());
					System.out.println("\t\t" + menuItem.getPrice());
					System.out.println("\t" + menuItem.getDescription());
				}
			}
		}

		private boolean isVegetarian(String name, Iterator iterator) {
			while (iterator.hasNext()) {
				MenuItem menuItem = (MenuItem)iterator.next();
				if (menuItem.getName().equals(name)) {
					if (menuItem.isVegetarian()) {
						return true;
					}
				}
			}
			return false;
		}
	}