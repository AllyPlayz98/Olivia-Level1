public class OlympicAthlete {
	private String name;
	private String country;
	private String sport;
	private int gold;
	private int silver;
	private int bronze;

	public OlympicAthlete(String name, String country, String sport) {
		this.name = name;
		this.country = country;
		this.sport = sport;
	}
	void setGold(int gnum) {
		this.gold = gnum;
	}
	void setSilver(int snum ) {
		this.silver = snum;
	}
	void setBronze(int bnum) {
		this.bronze = bnum;
	}
}
