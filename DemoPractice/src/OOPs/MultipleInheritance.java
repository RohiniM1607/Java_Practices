package OOPs;

import java.util.*;
import java.text.*;    //Date

interface SearchbyGenre{
	void searchbyGenre(String genre);
}

interface SearchbyTitle{
	void searchbyTitle(String title);
}

class Movie{

	private String title;
	private String category;
	private int rating;
	private String language;
	private Date releaseDate;
	private String country;
	private String genre;

	public Movie(String title, String category, int rating, String language, Date releaseDate, String country, String genre){
		this.title = title;
		this.category = category;
		this.rating = rating;
		this.language = language;
		this.releaseDate = releaseDate;
		this.country = country;
		this.genre = genre;
	}

	public String getTitle(){
		return title;
	}

	public String getGenre(){
		return genre;
	}

	public void getMovieDetails(){
		System.out.println("Title: " + title);
		System.out.println("Category: " + category);
		System.out.println("Rating: " + rating);
		System.out.println("Language: " + language);
		System.out.println("Release Date: " + releaseDate);
		System.out.println("Country: " + country);
		System.out.println("Genre: " + genre);
		System.out.println("----------------------------------");
	}
}

public class MultipleInheritance implements SearchbyTitle, SearchbyGenre{

	private static List<Movie> movieList = new ArrayList<Movie>();

	public void searchbyTitle(String title){
		for(Movie movie : movieList){
			if(movie.getTitle().equalsIgnoreCase(title)){
				movie.getMovieDetails();
			}
		}
	}

	public void searchbyGenre(String genre){
		for(Movie movie : movieList){
			if(movie.getGenre().equalsIgnoreCase(genre)){
				movie.getMovieDetails();
			}
		}
	}

	public static void main(String[] args){

		MultipleInheritance C = new MultipleInheritance();

		Calendar cal = Calendar.getInstance();
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date date = cal.getTime();

		Movie M1 = new Movie("AAA","Drama",3,"English",date,"France","Action");
		movieList.add(M1);

		Movie M2 = new Movie("BBB","Story",3,"English",date,"India","Documentary");
		movieList.add(M2);

		Movie M3 = new Movie("CCC","Drama",3,"English",date,"Italy","Action");
		movieList.add(M3);

		System.out.println("--------------Searching Movie by Genre----------------");
		C.searchbyGenre("Action");

		System.out.println("--------------Searching Movie by Title----------------");
		C.searchbyTitle("BBB");
	}
}