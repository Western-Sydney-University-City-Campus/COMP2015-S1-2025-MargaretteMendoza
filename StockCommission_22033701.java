/**
 * prompt 'Enter the share price'
get share price
prompt 'Enter number of shares'
get number of shares
stock cost =
commission =
total =
display stock cost
display commission
display total
 */

/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * 
 */
public class StockCommission_22033701 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		double sharePrice = 0;
		int numberOfShares = 0;
		int stockCost = 0;
		
		System.out.println("Enter the share price ");
		sharePrice = kb.nextDouble();
		
		while (sharePrice < 0 || sharePrice >= 500) {
			System.out.println("Share price must be greater than $0 and less than or equal to 500 ");
			sharePrice = kb.nextDouble();
		}
		
		
		System.out.println("Enter the number of shares ");
		numberOfShares = kb.nextInt();
		
		while (numberOfShares < 100 || numberOfShares >=100000) {
			System.out.println("Number of shares must be between 100 and 100,000");
			numberOfShares = kb.nextInt();
			
		
		}
		 stockCost = (int) (sharePrice * numberOfShares);
		 int commission = (int) (stockCost * .0425);
		 int total = stockCost + commission;
			
		 System.out.println("Stock cost: " + stockCost);
		 System.out.println("Commission: " + commission);
		 System.out.println("Total: " + total);
		
	}

}
