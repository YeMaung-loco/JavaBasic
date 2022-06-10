package JavaAdvance;

class Movie {
	StringBuffer title, name;
	int year;

	Movie() {
		this.title = new StringBuffer();
		this.name =  new StringBuffer();
		year = 0;
	}

	void setTitle(char movieTitle[]) {
		for (char mtitle : movieTitle)
			this.title.append(mtitle);
	}

	void setYear(int year) {
		this.year = year;
	}

	void setDirector(char dir[]) {
		for (char director : dir)
			this.name.append(director);
	}

	void display() {
		System.out.println("Title-" + this.title.toString() +
				"\nDirector-" + this.name.toString() +
				"\nYear-" + this.year);
	}
}

public class myFavouriteMovie {

	public static void main(String[] args) {
		char movieTitle[] = { 'T', 'i', 't', 'a', 'n', 'i', 'c' };
		char director[] = { 'Y', 'e', 'M', 'a', 'u', 'n', 'g' };
		int year = 2000;

		Movie movie = new Movie();
		movie.setTitle(movieTitle);
		movie.setDirector(director);
		movie.setYear(year);
		movie.display();
	}
}
