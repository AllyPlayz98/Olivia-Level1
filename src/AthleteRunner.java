
public class AthleteRunner {
	public static void main(String[] args) {
		Athlete o = new Athlete("tennis", "Olivia");
		Athlete j = new Athlete("volleyball", "Julia");
		Athlete a = new Athlete("baseball", "Alex");

		System.out.println(o.getName() + " plays " + o.getSport() + " and they are jersey number " + o.getJersey());
		o.setName("Hicks");
		System.out.println(o.getName() + " plays " + o.getSport() + " and they are jersey number " + o.getJersey());
		System.out.println(j.getName() + " plays " + j.getSport() + " and they are jersey number " + j.getJersey());
		System.out.println(a.getName() + " plays " + a.getSport() + " and they are jersey number " + a.getJersey());
	System.out.println(Athlete.athleteNum);
	}
}
