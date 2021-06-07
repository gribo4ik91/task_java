package Mammal;

public class Cat extends Feline implements Claws {

	private float nrOfAgeInMonth;

	public Cat() {

	}

	@Override
	public void makeSound() {
		System.out.println("Cat can Miau");
	}

	Cat(float nrOfAgeInMonth, String colorOfEyes, int numberOfLegs, String breed, FelineGroup group) {
		if (nrOfAgeInMonth <= 0.0) {
			throw new IllegalArgumentException("numberOfAgeInMonth can't be less then 0.0 or equal to 0.0. You introduce: " + nrOfAgeInMonth);
		} else {

			this.nrOfAgeInMonth = nrOfAgeInMonth;
		}
		super.setBreed(breed);
		super.setGroup(group);
		super.setColorOfEyes(colorOfEyes);
		super.setNumberOfLegs(numberOfLegs);
	}

	Cat(float nrOfAgeInMonth, String colorOfEyes, int numberOfLegs, String breed) {
		this(nrOfAgeInMonth, colorOfEyes, numberOfLegs, breed, FelineGroup.CAT);
	}

	public float getNrOfAgeInMonth() {
		return nrOfAgeInMonth;
	}

	public void setNrOfAgeInMonth(float nrOfAgeInMonth) {
		if (nrOfAgeInMonth <= 0.0) {
			System.out.println("It shouldn't be empty");
		} else {
			this.nrOfAgeInMonth = nrOfAgeInMonth;
		}
	}

	@Override
	public String toString() {
		return "Cat { " + '\n' +
				"numberOfAgeInMonth = " + nrOfAgeInMonth + super.toString() + '\n' +
				" }";
	}

	@Override
	public void haveClaws() {
		System.out.println("Cat have claws");
	}
}
