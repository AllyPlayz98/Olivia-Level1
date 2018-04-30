import java.util.Random;

public class GuessMyNumber {
	int r;

	public GuessMyNumber() {
		Random ran = new Random();
		r = ran.nextInt(100);
		r += 1000;
	}

	public boolean checkNumber(int r1) {
		if (r1 == r) {
			return true;
		}
		else {
			return false;
		}
	}

}
