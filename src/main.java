import java.util.Scanner;
import java.util.Random;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World!");

Scanner scan= new Scanner (System.in);
charPrint cp= new charPrint();

System.out.println("What is your name?");
String name =scan.nextLine();
System.out.println("Hello "+ name);

System.out.println("Would you like to continue with the survey? Yes or No");
 
String yesOrNo =scan.nextLine();
if(yesOrNo.equals("yes") || yesOrNo.equals("Yes")){
	
	System.out.println("Do you have a red car?");
	String carYesorNo =scan.nextLine();
	
	System.out.println("What is your favorite pet?");
	String petName =scan.nextLine();
	
	System.out.println("How old is your favorite pet?");
	int petAge =scan.nextInt();
	
	System.out.println("What is your lucky number?");
	int luckyNumber =scan.nextInt();
	scan.nextLine();
	
	System.out.println("Who is your favorite quarterback?");
	String qB =scan.nextLine();
	
	System.out.println("What is their jersey number?");
	int jerseyNumber =scan.nextInt();
	scan.nextLine();
	
	System.out.println("What is the two digit model year of your car?");
	int carYear =scan.nextInt();
	scan.nextLine();
	
	System.out.println("What is the first name of your favorite actor or actress?");
	String actor =scan.nextLine();
	
	System.out.println("Enter a number between 1 and 50.");
	int random  =scan.nextInt();
	
	
	System.out.println("Time for your lottery numbers!");
	getRandomNumber(1,75);
	int one = (int)getRandomNumber(1,75);
	int two = (int)getRandomNumber(1,75);
	int three = (int)getRandomNumber(1,75);
	int four = (int)getRandomNumber(1,75);
	int five = (int)getRandomNumber(1,75);
	
	System.out.print(one +", "+ two +", "+ three +", "+ four +" ,"+ five);
	int magicNumber = carYear + random;
	System.out.println(" Magic Number: " + magicNumber);	
	
	System.out.println("Would you like to play again? Yes or No");
	//Find a while loop that would start the game again if they answer yes
	
	
	
	
	
	
	
	System.out.println("Thanks for your time, have a nice day.");
	
	
	
	
}
else {
	
	System.out.println("Thanks for your time. Go home and think about your life.");
	System.exit(0);
}








	}
	// print the valid characters for input
	public static double getRandomNumber(int min, int max) {
		
		double x =(Math.random()*((max-min) +1)) + min;
		return x;
		
		
		
		
	}
}
