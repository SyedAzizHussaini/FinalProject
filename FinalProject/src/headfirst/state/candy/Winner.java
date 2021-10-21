package headfirst.state.candy;

public class Winner {
	
	private String name;
	private int age;
	private String candyName;
	private String additionalFlavour;
	
	public Winner(String name,int age,String candyName,String additionalFlavour) {
		super();
		this.name=name;
		this.age=age;
		this.candyName=candyName;
		this.additionalFlavour=additionalFlavour;
	}
	
	public String toString() {
		if (candyName == null) {
			candyName = "Choco Fudge Candy";
		}
		
		if (additionalFlavour.isBlank() ) {
			additionalFlavour = "No Additonal Flavour requested";
		}
		return "Winner Name :" + name +" \n Age :"+age+"\n Candy Won :"+candyName+"\n AdditionalFlavour :"+additionalFlavour;
	}
}
