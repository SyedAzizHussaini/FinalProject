package headfirst.state.candy;

public class WinnerStateBuilder {
	CandyStore candyStore;
	String candyName;
	String name;
	int age;
	String additionalFlavour;
	State closedState;
	State state = closedState;
	 
    public WinnerStateBuilder setCandyname(String candyName) {
		this.candyName = candyName;
		return this;
	}
    
    public WinnerStateBuilder setName(String name) {
		this.name = name;
		return this;
	}
    
    public WinnerStateBuilder setAge(int age) {
		this.age = age;
		return this;
	}
 
	public WinnerStateBuilder addAdditionalFlavour(String additionalFlavour) {
		this.additionalFlavour = additionalFlavour;
		return this;
	}
 
 
	public Winner getCandy() {
		return new Winner(name, age, candyName, additionalFlavour);	
	}
 

}
