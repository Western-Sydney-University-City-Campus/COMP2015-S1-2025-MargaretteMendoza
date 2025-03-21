/**
prompt 'Enter the number of cookies eaten'
get number cookies
serves consumed = number cookies/40 * 10
total calories = serves consumed * 300
display 'You consumed ' total calories ' when you ate 
' number cookies ' cookies'
**/
/**
 * 
 */
package Week2;

/**
 * 
 */
import java.util.Scanner;
public class Calorie_Watcher22033701 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
	int numberOfCookies = 0;
	int bagOfCookies = 40;
	int serving = 10;
	int singleServing = 300;
		
	//get number of cookies
	System.out.print("Enter number of cookies");
		numberOfCookies = kb.nextInt();
		
		//validate input
		while(numberOfCookies < 1) {
			System.out.println("Please enter a positive number");
			numberOfCookies = kb.nextInt();
		}
		
		 int servesConsumed = (numberOfCookies * serving) / bagOfCookies;
		int totalCalories = servesConsumed * singleServing;
		
		System.out.println(" You consumed " + totalCalories + " calories when you ate " + numberOfCookies + " cookies ");
		
		
	}

}
