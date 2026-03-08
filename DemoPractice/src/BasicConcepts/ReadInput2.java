package BasicConcepts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ReadInput2 {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Movie ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter movie Name: ");
		String name = sc.nextLine();
		System.out.println("Enter the discrition: ");
		String discription = sc.next();
		System.out.println("Enter Movie Language: ");
		String language = sc.next();
		System.out.println("Enter Movie Genre: ");
		String genre = sc.next();
		System.out.println("Enter Movie release date(dd/mm/yyyy):");
		String date = sc.next();
		SimpleDateFormat moviereleasedate = new SimpleDateFormat("dd/MM/yyyy");
		Date moviedate = moviereleasedate.parse(date);
		System.out.println("Enter Movie seat Cost: ");
		float seatcost = sc.nextFloat();
		System.out.println("ENTERED MOVIE DETAILS ARE\n");
		System.out.println("Movie ID : "+id);
		System.out.println("Movie Name : "+name);
		System.out.println("Movie Discription : "+discription);
		System.out.println("Movie Language: "+language);
		System.out.println("Movie Genre: "+genre);
		System.out.println("Movie date: "+moviedate);
		System.out.println("Movie seat cost: "+seatcost);
	}

}
