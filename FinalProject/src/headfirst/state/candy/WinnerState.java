package headfirst.state.candy;
import java.util.Scanner;

public class WinnerState implements State {
    CandyStore candyStore;
    Scanner in = new Scanner(System.in);
    Scanner a = new Scanner(System.in);
    String name;
    String flavour;
    int age;
 
    public WinnerState(CandyStore candyStore) {
        this.candyStore = candyStore;
    }
 
	public void orderNow() {
		System.out.println("Please wait, we're already giving you a Candy");
	}
 
	public void cancelOrder() {
		System.out.println("Please wait, we're already giving you a Candy");
	}
 
	public void placeOrder() {
		System.out.println("placing the order again doesn't get you another Candy!");
	}
 
	public void delivered()  {
		System.out.println("YOU'RE A WINNER! You get two candy's for your quarter, please fill the below form to claim prize");
		System.out.println("Enter name :");
		name=in.nextLine();
		System.out.println("Enter age :");
		age=in.nextInt();
		System.out.println("Enter Flavour(Optional) :");
		flavour=a.nextLine();;
		System.out.println(flavour);
		System.out.println("processing...!");
		
		//Winner builder = new WinnerStateBuilder();
		Winner winner = new WinnerStateBuilder().setName(name).setAge(age).addAdditionalFlavour(flavour).getCandy();
		System.out.println(winner);
		
		candyStore.giveCandy();
		if (candyStore.getCount() == 0) {
			candyStore.setState(candyStore.getClosedState());
		} else {
			candyStore.giveCandy();
			if (candyStore.getCount() > 0) {
				candyStore.setState(candyStore.getOpenState());
			} else {
            	System.out.println("Oops, All Candies has been sold out :(!");
				candyStore.setState(candyStore.getClosedState());
			}
		}
	}
 
	public String toString() {
		return "giving two Candies for your quarter, because YOU'RE A WINNER!";
	}
}
