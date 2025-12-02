package bpi.project1.hello;
import java.util.Scanner;



public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Java Training 101!\n");
		System.out.println("What is your name?");
		String name = scan.next();
		
		System.out.println("Hello, "+ name +"!");
		
	}

}
