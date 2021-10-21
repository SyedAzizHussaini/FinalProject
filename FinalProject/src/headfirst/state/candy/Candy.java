package headfirst.state.candy;

public abstract class Candy {
	String name;

	Milk milk;
	Chocolate chocolate;
	Sugar sugar;
	Bubblegum bubblegum;
	Toffee toffee;

	abstract void prepare();

//	void bake() {
//		System.out.println("Bake for 25 minutes at 350");
//	}

	void cut() {
		System.out.println("Shaping the Candy");
	}

	void wrap() {
		System.out.println("Wrapping Candy in official CandyStore pack");
	}

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("** " + name + " **\n");
		if (milk != null) {
			result.append(milk);
			result.append("\n");
		}
		if (sugar != null) {
			result.append(sugar);
			result.append("\n");
		}
		if (bubblegum != null) {
			result.append(bubblegum);
			result.append("\n");
		}
		
		if (toffee != null) {
			result.append(toffee);
			result.append("\n");
		}
		if (chocolate != null) {
			result.append(chocolate);
			result.append("\n");
		} 
	
		return result.toString();
	}
}
