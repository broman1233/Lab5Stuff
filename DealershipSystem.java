import java.util.InputMismatchException;
import java.util.Scanner;
public class DealershipSystem 
{
	public static void main(String[] args) {
		
		
		
		String menuPrompt = "\n Please pick your menu selection";
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		 String vinNum;
		int userSelection= 0;
		String menuError = "Selection must be a number between 1-8";
		String menuDisplay = //displays menu to screen
				"1.) Create A Car \n" +
				"2.) Modify A Car \n" +
				"3.) Delete A Car \n" +
				"4.) Find A Car \n" +
				"5.) Record A Transaction \n" +
				"6.) Display Sales Record \n " +
				"7.) Display Total Sales  \n " +
				"8.) Exit The Program";
		
		
		
		do {
			System.out.print(menuDisplay);
			boolean validInput = false;
			while (!validInput) {
				try {
					System.out.print(menuPrompt);
					userSelection = keyboard.nextInt();
					
					while((userSelection < 1 || userSelection > 8)) {
						System.out.println("invalid selection, please enter a number between 1-5");
						userSelection = keyboard.nextInt();
					}
					validInput = true;
					break;
				}
				catch(InputMismatchException m) {
					System.out.print(menuError);
				}
			}
					
			switch(userSelection)
			{
			case 1: 
				//allows user to create a Car and passes in the user input and the arraylist of cars
				// ask user for stuff below
				System.out.print(" Create a Car");
				System.out.print("Please enter a Vin Number for your Car");
				 vinNum = keyboard.nextLine();
				//createCar(vin#,model,year,color,make,value, carList); 
				
				//quit = false;
				//break;
			case 2:
				// For Modifing a Car
				//ask user for stuff below
				//modifyCar(vin#,model,year,color,make,value, carList); 
				
				//quit = false;
				//break;
			case 3:
				//For Deleting a Car
				//ask user for stuff below
				//deleteCar(vin#,model,year,color,make,value, carList); 
				
				//quit = false;
				//break;
			case 4:
				//For Finding a Car
				//ask user for stuff below
				//findCar(vin#,model,year,color,make,value, carList); 
				
				//quit = false;
				//break;
			case 5:
				// Recording Transactions needs the list of Transactions
				//ask user for stuff below
				//recordTrans(vin#,model,year,color,make,value,empNumber, TransList); 
				
				//quit = false;
				//break;
			case 6:
				
				//DisplaySales(empNumber, carList); 
				
				//quit = false;
				//break;
			case 7:
				//DisplayTotalSales(empNumber, carList); 
				
				//quit = false;
				//break;
			case 8:
				
				quit = true;
				break;
			}
		
		
	} while(!quit); 
		System.out.println("Goodbye!");


			keyboard.close();
		
}
}
