/*
 * This program demonstrates the use of two methods, serving different functions. ShowMovieRatings() accepts three parameters: movieName,
 * rating, and year. It then prints the three of them to the screen. separator() prints out a String to serve as a separator between the 
 * printing of different movies.
 */


public class MovieRatings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		separator();
	    showMovieRatings("The Shawshank Redemption", 5, 1994);
	    separator();
	    showMovieRatings("Superbabies: Baby Geniuses 2", 1, 2004);
	    separator();
	}
	
	public static void separator() {
		
	    System.out.println("===========================");
	
	}
		
	  /*
	   * print individual movie ratings
	   * @param movieName the name of the movie
	   * @param rating the rating for the movie
	   * @param year the year the movie was released
	   */
	
	public static void showMovieRatings(String movieName, int rating, int year) {
	
		System.out.println("Movie:  " + movieName);
	    System.out.println("Rating: " + rating + "/5");
	    System.out.println("Year:   " + year);
	
	}
}
