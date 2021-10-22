package headfirst.state.candy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WinnerStateTesting {

	@Test
	void test() {
		String name = "John";
		int age = 15;
		String candyName = "Choco Fudge Candy";
		String additionalFlavour = "No Additonal Flavour requested";
		/*String output ="Winner Name :John \r\n"
				+ " Age :15\r\n"
				+ " Candy Won :Choco Fudge Candy\r\n"
				+ " AdditionalFlavour :No Additonal Flavour requested\r"
				+ "";*/
		
		String output = "Winner Name :" + name +" \n Age :"+age+"\n Candy Won :"+candyName+"\n AdditionalFlavour :"+additionalFlavour;
		Winner winner = new WinnerStateBuilder().setName(name).setAge(age).addAdditionalFlavour("").getCandy();
		String result = winner.toString();
		assertEquals(output, result);
	}

}
