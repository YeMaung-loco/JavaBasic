package JavaAdvance;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonFiction nonFiction = new NonFiction("Java", "John", 1, 30);
		System.out.println(nonFiction.toString());
	}

}

class Book {
	String title, author;

	Book(String t, String a) {
		this.title = t;
		this.author = a;
	}

	public String toString() {
		return " Title-" + this.title + " Author-" + this.author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}

class Fiction extends Book {
	int level;

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	Fiction(String t, String a, int l) {
		super(t, a);
		this.level = l;

	}

	public String toString() {
		return super.toString() + " ReadingLevel-" + this.level;
	}

}

class NonFiction extends Fiction {
	int pages;

	NonFiction(String t, String a, int l, int p) {
		super(t, a, l);
		this.pages = p;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String toString() {
		return super.toString() + " Pages-" + this.pages;
	}

}
