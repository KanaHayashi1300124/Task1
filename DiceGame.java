import java.util.Random;

class DiceGame{
    public static void main(String args[]){
	Random rand = new Random();
	int n1 = rand.nextInt(6) + 1;
	int n2 = rand.nextInt(6) + 1;

	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + n1);
	System.out.println("Die 2: " + n2);
	System.out.println("Total value: " + (n1 + n2));
    }
}
	
    
