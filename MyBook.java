package OriginalPlace;
public class book {
	String title,author,publisher;
	book(String myTitle,String myAuthor,String myPublisher)
	{
		title=myTitle;
		author=myAuthor;
		publisher=myPublisher;
	}
	String getTitle()
	{
		return title;
	}
	String getAuthor()
	{
		return author;
	}
	String getPublisher()
	{
		return publisher;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book mybook = new book("2019 PopeZheng Java study","PopeZheng","WHU Publisher");
		System.out.println("Book:"+mybook.title);
		System.out.println("Author:"+mybook.author);
		System.out.println("Publisher:"+mybook.publisher);
	}
}