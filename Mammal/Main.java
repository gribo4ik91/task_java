package Mammal;

public class Main {

	public static void main(String[] args) {

		Cat cat = new Cat(0.5f, "Blue", 4, "Treat", FelineGroup.CAT);
		cat.makeSound();
		cat.haveClaws();

		Human human = new Human(true,25,"Short",1.85d);
		human.makeSound();
		human.haveClaws();


		System.out.println(cat);
		System.out.println(human);

	}

}
