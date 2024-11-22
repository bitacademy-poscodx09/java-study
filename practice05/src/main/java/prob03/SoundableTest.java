package prob03;

public class SoundableTest {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
		printSound(new Sparrow());
		printSound(new Duck());
	}

	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
}