package Movie;
import java.util.Scanner;
public class MovieDriver_Task1 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
		Movie movie = new Movie();
		System.out.println("Enter the name of a movie");
		String movieTitle = keyboard.nextLine();
		System.out.println("Enter the rating of the movie");
		String movieRating = keyboard.nextLine();
		System.out.println("Enter the number of tickets sold for this movie");
		int movieTickets = keyboard.nextInt();
		movie.setTitle(movieTitle);
		movie.setRating(movieRating);
		movie.setSoldTickets(movieTickets);
		System.out.println(movie.toString());
		keyboard.close();
	}

}
