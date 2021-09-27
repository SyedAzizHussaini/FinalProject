package headfirst.command.candy;

import java.util.ArrayList;

public abstract class Candy {
	String name;;
	String chocolate;
	String sugar;
	String toffee;
	String milk;
	String sauce;
	ArrayList ingredients = new ArrayList();

	void prepare() {
		System.out.println("\nPreparing " + name);
		System.out.println("Adding "+milk+"....");
		System.out.println("Adding "+sugar+"....");
		System.out.println("Adding Flavours: ");
		for (int i = 0; i < ingredients.size(); i++) {
			System.out.println("   " + ingredients.get(i));
		}
	}

	void stir() {
		System.out.println("stir for 5 minutes at 300");
	}

	void cool() {
		System.out.println("Refrignating the candy for 1 hour");
	}

	void shape() {
		System.out.println("Giving the shape to the candy");
	}

	void wrap() {
		System.out.println("Wrapping candy in official store cover");
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(milk + "\n");
		display.append(sugar + "\n");
		for (int i = 0; i < ingredients.size(); i++) {
			display.append((String )ingredients.get(i) + "\n");
		}
		return display.toString();
	}
}
