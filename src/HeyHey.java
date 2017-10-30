
public class HeyHey {
	String myName;

	public HeyHey(String name) {
		System.out.println(name + " says hi.");
		myName = name;
	}

	void swallows(int num) {
		System.out.println(myName + " swallows" + " " + num + " rock.");
	}

	void trips(String n) {
		System.out.println(myName + " trips over a root." + n);
	}

	void screams() {
		System.out.println(myName + " screams and Moana puts a coconut over his head to quiet him.");
	}
}
