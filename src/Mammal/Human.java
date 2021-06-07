package Mammal;

public class Human extends Mammal implements Claws {

	private boolean haveWork;
	private int nrOfYears;
	private String typeOfHair;
	private double high;




	@Override
	public void makeSound() {
		System.out.println("Human can speak, human  can speak a lot");
	}

	public Human(boolean haveWork, int nrOfYears, String typeOfHair, double high) {
		this.haveWork = haveWork;
		this.nrOfYears = nrOfYears;
		this.typeOfHair = typeOfHair;
		this.high = high;

	}

	public boolean isHaveWork() {
		return haveWork;
	}

	public void setHaveWork(boolean haveWork) {
		this.haveWork = haveWork;
	}

	public int getNrOfYears() {
		return nrOfYears;
	}

	public void setNrOfYears(int nrOfYears) {
		this.nrOfYears = nrOfYears;
	}

	public String getTypeOfHair() {
		return typeOfHair;
	}

	public void setTypeOfHair(String typeOfHair) {
		this.typeOfHair = typeOfHair;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	@Override
	public void haveClaws() {
		System.out.println("Human do not have a claws");
	}

	@Override
	public String toString() {
		return "Human {" + '\n' +
				"haveWork = " + haveWork + '\n' +
				"nrOfYears = " + nrOfYears + '\n' +
				"typeOfHair = " + typeOfHair +  '\n'  +
				"high = " + high + '\n' +
				'}';
	}
}
