
public class Bat extends Mammal {
	public int energyLevel = 300;
	
	public void fly() {
		System.out.println("The Bat has taken flight.");
		this.energyLevel -=50;
	}
	
	public void eatHumans() {
		System.out.println("Dear god!");
		this.energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("¯\\_(ツ)_/¯");
		this.energyLevel -= 100;
	}
	
}
