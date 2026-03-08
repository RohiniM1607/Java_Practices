package Functions;

import java.util.Scanner;

public class FunctionDeclare {
	public static void getMovieDetails(String movieTit,String movieDes,float movieDur, String movieLan, String movieRelDate, String movieCountry, String movieGenre) {
		System.out.println("--Movie Details--");
		System.out.println("Movie Title: "+ movieTit);
		System.out.println("Movie Description: "+movieDes);
		System.out.println("Movie Duration: "+movieDur);
		System.out.println("Movie Language: "+movieLan);
		System.out.println("Movie Release Date: "+movieRelDate);
		System.out.println("Movie Genre: "+movieGenre);
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Movie Title: ");
		String movieTit = sc.nextLine();
		System.out.print("Enter the Movie Description: ");
		String movieDes = sc.nextLine();
		System.out.print("Enter the Movie Duration: ");
		float movieDur = sc.nextFloat();
		sc.nextLine();
		System.out.print("Enter the Movie language: ");
		String movieLan = sc.nextLine();
		System.out.print("Enter the Movie Release Date: ");
		String movieRelDate = sc.nextLine();
		System.out.print("Enter the Movie Country: ");
		String movieCountry = sc.nextLine();
		System.out.print("Enter the Movie Genre: ");
		String movieGenre = sc.nextLine();
		getMovieDetails(movieTit, movieDes, movieDur, movieLan, movieRelDate, movieCountry, movieGenre);
		sc.close();
	}

}
