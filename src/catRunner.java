
public class catRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the Cat class √ */
		Cat kitty = new Cat("whiskers");
		// 1. Make the Cat meow √
		kitty.meow();
		// 2. Get the Cat to print it's name √
		kitty.printName();
		// 3. Kill the Cat! √
		for (int l = 0; l <= 8; l++) {
			kitty.kill();
		}
		Cat kitty2 = new Cat("fluffy");

		kitty2.printName();
	}
}
