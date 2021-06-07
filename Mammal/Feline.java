package Mammal;

public class Feline extends Mammal {

	private String colorOfEyes;
	private int numberOfLegs;
	private String breed;
	private FelineGroup group;

	@Override
	public void makeSound() {
		System.out.println("Making sound ...");
	}

	public FelineGroup getGroup() {
		return group;
	}

	public void setGroup(FelineGroup group) {
		this.group = group;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColorOfEyes() {
		return colorOfEyes;
	}

	public void setColorOfEyes(String colorOfEyes) {
		this.colorOfEyes = colorOfEyes;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return
				'\n' + "colorOfEyes = " + colorOfEyes + '\n' +
						"numberOfLegs = " + numberOfLegs + '\n' +
						"breed = " + breed + '\n' +
						"group = " + group;
	}
}
