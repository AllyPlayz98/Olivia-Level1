public class Olympics {
	public static void main(String[] args) {
		OlympicAthlete oa1 = new OlympicAthlete("Olivia", "U.S.A", "Sleading");
		OlympicAthlete oa2 = new OlympicAthlete("Julia", "Canada", "Half-Pipe");
		OlympicAthlete oa3 = new OlympicAthlete("Wendy", "Netherlands", "Skiing");
		OlympicAthlete oa4 = new OlympicAthlete("Alex", "Slovakia", "Snowboarding");

		oa1.setSilver(3);

		oa2.setGold(1);
		oa2.setBronze(1);

		oa3.setSilver(1);
		oa3.setBronze(1);

		oa4.setBronze(2);

		System.out.println(oa1.getName() + " is from " + oa1.getCountry() + " and compeates in " + oa1.getSport() + ".");
		System.out.println(oa1.getName() + " has " + oa1.getGold() + " golds, " + oa1.getSilver() + " silvers, and " + oa1.getBronze() + " bronzes.");
		
		System.out.println(oa2.getName() + " is from " + oa2.getCountry() + " and compeates in " + oa2.getSport() + ".");
		System.out.println(oa2.getName() + " has " + oa2.getGold() + " golds, " + oa2.getSilver() + " silvers, and " + oa2.getBronze() + " bronzes.");
		
		System.out.println(oa3.getName() + " is from " + oa3.getCountry() + " and compeates in " + oa3.getSport() + ".");
		System.out.println(oa3.getName() + " has " + oa3.getGold() + " golds, " + oa3.getSilver() + " silvers, and " + oa3.getBronze() + " bronzes.");
		
		System.out.println(oa4.getName() + " is from " + oa4.getCountry() + " and compeates in " + oa4.getSport() + ".");
		System.out.println(oa4.getName() + " has " + oa4.getGold() + " golds, " + oa4.getSilver() + " silvers, and " + oa4.getBronze() + " bronzes.");
	}
}
