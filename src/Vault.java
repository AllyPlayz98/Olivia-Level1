import java.util.Random;

public class Vault {
	int secretcode;

	public Vault() {
		Random ran = new Random();
		secretcode = ran.nextInt(1000000);
		secretcode += 1;
	}

	public boolean checkCode(int g) {
		if (secretcode == g) {
			return true;
		} else {
			return false;
		}
	}
}