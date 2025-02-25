/*
Class: CMSC203 CRN 202530
Program: Lab 1
Instructor: Grigoriy Grinberg 
Summary of Description: (Making a driver for the Movie.java program) 
Due Date: 02/24/2025 
Integrity Pledge: I pledge that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
*/
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
