package Movie;
import java.util.Scanner;

public class MovieDriver_Task2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Movie movie = new Movie();
		String option = "y";
		do {
			//inputing the values
			System.out.println("Enter the name of a movie");
			String movieTitle = keyboard.nextLine();
			System.out.println("Enter the rating of the movie");
			String movieRating = keyboard.nextLine();
			System.out.println("Enter the number of tickets sold for this movie");
			int movieTickets = keyboard.nextInt();
			keyboard.nextLine(); //consumes next line
			
			//setting the values
			movie.setTitle(movieTitle);
			movie.setRating(movieRating);
			movie.setSoldTickets(movieTickets);
			System.out.println(movie.toString());
			
			//selecting an option
			System.out.println("Do you want to enter another? (y or n)");
			option = keyboard.nextLine();
			
		}while(!option.equalsIgnoreCase("n"));
		System.out.println("Goodbye");
		keyboard.close();
	}

}
