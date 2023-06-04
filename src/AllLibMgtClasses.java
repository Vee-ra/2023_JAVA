import java.util.Date;

public class AllLibMgtClasses {

}

class User {
	String userName;
	int userId;
	String mobileNum;
	String email;

	public User(String userName, int userId, String mobileNum, String email) {
		// super();
		this.userName = userName;
		this.userId = userId;
		this.mobileNum = mobileNum;
		this.email = email;
	}

	public void printUserInfo() {
		System.out.println("Name " + userName);
		System.out.println("Id " + userId);
		System.out.println("mobNum " + mobileNum);
		System.out.println("mailTo " + email);
	}
}

class Book {
	String Tittle;
	String Author;
	String publisher;
	Date publicationDate;

	public Book(String tittle, String author, String publisher, Date publicationDate) {
		// super();
		Tittle = tittle;
		Author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
	}

	public void printBookInfo() {
		System.out.println("Tittle " + Tittle);
		System.out.println("Author " + Author);
		System.out.println("Publisher " + publisher);
		System.out.println("PublicationDate " + publicationDate);
	}

}

class Card {
	User user;
	Book book;
	Date barrowedDate;
	Date dueDtae;
	boolean isReturned;

	public Card(User user, Book book, Date barrowedDate, Date dueDtae, boolean isReturned) {
		// super();
		this.user = user;
		this.book = book;
		this.barrowedDate = barrowedDate;
		this.dueDtae = dueDtae;
		this.isReturned = isReturned;

	}

	public void printCardInfo() {
		System.out.println("User " + user);
		System.out.println("Book " + book);
		System.out.println("barrowedDate " + barrowedDate);
		System.out.println("dueDtae " + dueDtae);
		System.out.println("isReturned " + isReturned);
	}

}

class ReminderMessage {
	String message;
	Date sendDate;

	public ReminderMessage(String message, Date sendDate) {
		this.message = message;
		this.sendDate = sendDate;
	}

	public void printMessage() {
		System.out.println("Reminder Message: " + message);
		System.out.println("Send Date: " + sendDate);
	}
}
