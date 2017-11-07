
public class Athlete {
	private String sport;
	private String name;
	private int jersey;

	static int jerseyNumber = 1;
	static int athleteNum;

	public Athlete(String sport, String name) {
		this.sport = sport;
		this.name = name;
		this.jersey = jerseyNumber;
		jerseyNumber++;
		athleteNum++;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJersey() {
		return jersey;
	}
	public static int getathleteNum() {
		return athleteNum;
	}
}
