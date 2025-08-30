package package1;
import java.util.LinkedList;

public class Node {
private String title;
private Node next;

public Node(String title) {
	this.title=title;
}
public static void main(String[] args) {
	System.out.println("--- Playlist ---");
	Node first = new Node("Wonder of You");
	Node second = new Node("My Way");
	Node third = new Node("Die in a Fire");
	
	first.next=second;
	second.next=third;
	
	

	display(first);
	
	System.out.println("");
	System.out.println("Before adding Song D:");
	display(first);
	
	
	Node fourth = new Node ("Love Me Tender");
	third.next=fourth;
	
	System.out.println("");
	System.out.println("After entering Song D:");
	display(first);
	
	first.next=second;
	second.next=fourth;
	System.out.println("");
	System.out.println("After removing Song B:");
	display(first);
	
	
}
public static void display(Node now) {
	while (now != null) {
		System.out.print(now.title + " --> ");
		now = now.next;
	}
	if (now == null) {
		System.out.println("Null");
	}
}
}
