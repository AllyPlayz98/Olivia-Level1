
public class NetflixRunner {
	public static void main(String[] args) {

	//1. Instantiate some Movie objects (at least 5).
		Movie m1 = new Movie("Captin America: The First Avenger", 3);
		Movie m2 = new Movie("Percy Jackson and the Olympains: The Lightning Thief", 5);
		Movie m3 = new Movie("Lord of the Rings: The Fellowship of the Ring", 4);
		Movie m4 = new Movie("Star Wars: The Force Awakens", 5);
		Movie m5 = new Movie("Avatar: The Last Airbender",1);
				
		//2. Use the Movie class to get the ticket price of one of your movies.

System.out.println(m1.getTicketPrice());
System.out.println(m2.getTicketPrice());
System.out.println(m3.getTicketPrice());
System.out.println(m4.getTicketPrice());
System.out.println(m5.getTicketPrice());
		//3. Instantiate a NetflixQueue.
		//4. Add your movies to the Netflix queue.
		//5. Print all the movies in your queue.
		
		//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
		//7. Use your NetflixQueue to finish the sentence "the second best movie is...."
	}
}
