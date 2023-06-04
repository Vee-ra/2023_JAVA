import java.security.MessageDigest;
import java.util.Date;

public class LibraryManagementApp {

	public static void main(String[] args) {
		
		User user1 = new User("Veera",01,"6383917214","vsvel.tsi@gmail.com");
		User user2 = new User("Sakthivel",01,"6383917214","vsvel.tsi@gmail.com");
		
		Book book1 = new Book("ABC","Sakthi","AVS Publications",new Date());
		Book book2 = new Book("CBA","Veera","SVA Publications",new Date());
		
		Card card1 = new Card(user1,book1,new Date(),new Date(),false);
		Card card2 = new Card(user2,book2,new Date(),new Date(),false);
		
		ReminderMessage message = new ReminderMessage("Please return the book", new Date());
		
		System.out.println("User Info " );
		user1.printUserInfo();
		System.out.println("==============");
		
		System.out.println("Bookinfo ");
		book2.printBookInfo();
		System.out.println("==============");
		
		System.out.println("printCardInfo ");
		card1.printCardInfo();
		System.out.println("==============");
		
		System.out.println("Reminder Message");
		message.printMessage();
		System.out.println("==============");
	}

}
