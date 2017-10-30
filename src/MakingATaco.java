
public class MakingATaco {
	String shell;
	boolean meat;
	boolean cheese;
	boolean lettuce;

	public MakingATaco(String shell, boolean meat, boolean cheese, boolean lettuce) {
		this.shell = shell;
		this.meat = meat;
		this.cheese = cheese;
		this.lettuce = lettuce;
	}

	public static void main(String[] args) {
		MakingATaco t1 = new MakingATaco("flour", true, true, false);
		MakingATaco t2 = new MakingATaco("soft", true, false, true);
		System.out.println(t1.getShell());
		System.out.println(t1.getMeat());
		System.out.println(t1.getCheese());
		System.out.println(t1.getLettuce());
		
		System.out.println(t2.getShell());
		System.out.println(t2.getMeat());
		System.out.println(t2.getCheese());
		System.out.println(t2.getLettuce());
		
		t1.setLettuce(true);
		System.out.println(t1.getShell());
		System.out.println(t1.getMeat());
		System.out.println(t1.getCheese());
		System.out.println(t1.getLettuce());
	}
public void setShell (String shell) {
	this.shell = shell;
}
public void setMeat (boolean meat) {
	this.meat = meat;
}
public void setCheese (boolean cheese) {
	this.cheese = cheese;
}
public void setLettuce (boolean lettuce) {
	this.lettuce = lettuce;
}

public String getShell() {
	return shell;
}
public boolean getMeat() {
	return meat;
}
public boolean getCheese() {
	return cheese;
}
public boolean getLettuce() {
	return lettuce;
}
}
