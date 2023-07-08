
public class Gorilla extends Mammal {
	
	public void throwSomething() {
		System.out.println("Yeet");
		this.energyLevel -= 5;
	}
	public void eatBananas() {
		System.out.println("Yum!");
		this.energyLevel += 10;
	}
	public void climb() {
		System.out.println("The King Of The World!");
		this.energyLevel -= 10;
	}
}
