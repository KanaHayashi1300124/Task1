import java.util.Random;
import java.util.Scanner;

class DiceGame{
    public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int n1 = rand.nextInt(6) + 1;
	int n2 = rand.nextInt(6) + 1;
	int sum = n1 + n2;

	System.out.println("What is your name?");
	String name = sc.next();
	System.out.println("Hello, " + name + "!");
	

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + n1);
	System.out.println("Die 2: " + n2);
	System.out.println("Total value: " + sum);

	if(sum > 7){
	    System.out.println("You won");
	}
	else {
	    System.out.println("You lost");
	}
	
    }
}
	
    
