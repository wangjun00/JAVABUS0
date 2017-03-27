package Pet0.javacore;

public class Testmaster {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Penguin pen = new Penguin();
		Master master = new Master();
		master.feed(dog);

		master.feed(pen);

	}

}
