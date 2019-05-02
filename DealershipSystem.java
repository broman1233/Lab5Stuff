import java.util.InputMismatchException;
import java.util.Scanner;
public class DealershipSystem 
{
	public static void main(String[] args) 
	{
		
		//needs the carList here ish
		
		String menuPrompt = "\n Please pick your menu selection";
		Scanner keyboard = new Scanner(System.in);
		boolean quit = false;
		boolean validValue = false;
		String vinNum = "poop";
		String model;
		String year;
		String color;
		String make = "oop";
		double value;
		int userSelection= 0;
		String menuError = "Selection must be a number between 1-8";
		String menuError2 = "Selection must be a number between 1-7";
		String menuDisplay = //displays menu to screen
				"1.) Create A Car \n" +
				"2.) Modify A Car \n" +
				"3.) Delete A Car \n" +
				"4.) Find A Car \n" +
				"5.) Record A Transaction \n" +
				"6.) Display Sales Record \n " +
				"7.) Display Total Sales  \n " +
				"8.) Exit The Program";
		String modifyMenu =
				"1.) Change the vin number \n" +
				"2.) Change the make number \n" +
				"3.) Change the model number \n" +
				"4.) Change the year number \n" +
				"5.) Change the color number \n" +
				"6.) Change the value number \n " +
				"7.) Go Back to main menu";
		
		
		do {
			System.out.println(menuDisplay);
			boolean validInput = false;
			while (!validInput) {
				try {
					System.out.println(menuPrompt);
					userSelection = Integer.parseInt(keyboard.nextLine());
					
					while((userSelection < 1 || userSelection > 8)) {
						System.out.println("invalid selection, please enter a number between 1-8");
						userSelection = Integer.parseInt(keyboard.nextLine());
					}
					validInput = true;
					break;
				}
				catch(InputMismatchException m) {
					System.out.println(menuError);
				}
			}
					
			switch(userSelection)
			{
			case 1: 
				//allows user to create a Car and passes in the user input and the arraylist of cars
				// ask user for stuff below
				System.out.println(" Create a Car");
				System.out.println("Please enter a Vin Number for your Car");
				vinNum = keyboard.nextLine();
				//System.out.println(vinNum);
				System.out.println("Please enter a make for your Car");
				make = keyboard.nextLine();
				//System.out.println(make);
				System.out.println("Please enter a model for your Car");
				model = keyboard.nextLine();
				System.out.println("Please enter a year for your Car");
				year = keyboard.nextLine();
				System.out.println("Please enter a color for your Car");
				color = keyboard.nextLine();
				while (!validValue) {
					try {
						System.out.println("Please enter a Value for your Car");
						value = keyboard.nextDouble();
						while (value < 0) {
							System.out.println("Please enter a Value for your Car");
							value = Integer.parseInt(keyboard.nextLine());
							
						}
						
						validValue = true;
						break;
						
					}
					catch (InputMismatchException z) {
						System.out.println("Please Enter a valid price number");
						keyboard.nextLine();
						
					}	
				}
								
				//createCar(vinNum,model,year,color,make,value, carList); 
				
				//quit = false;
				break;
			case 2:
				//ask for vin then find car
				System.out.println("Please enter a Vin Number for the Car you want to modify");
				vinNum = keyboard.nextLine();
				// For Modifing a Car
				//findCar(vinNum, carList)
				// going to need to find the car to Modify
				
				// then give them a menu to select what to edit
				do {
					System.out.println(modifyMenu);
					boolean validInput2 = false;
					while (!validInput2) {
						try {
							System.out.println(modifyMenu);
							userSelection = Integer.parseInt(keyboard.nextLine());
							
							while((userSelection < 1 || userSelection > 7)) {
								System.out.println(menuError2);
								userSelection = Integer.parseInt(keyboard.nextLine());
							}
							validInput2 = true;
							break;
						}
						catch(InputMismatchException m) {
							System.out.println(menuError2);
						}
					}
							
					switch(userSelection)
					{ 
					case 1:
						System.out.println("Enter the vin new number");
						vinNum = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
						break;
					case 2:
						System.out.println("Enter the new make ");
						make = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
						break;
					case 3: 
						System.out.println("Enter the new model ");
						make = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
						break;
					case 4:
						System.out.println("Enter the new year ");
						make = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
						break;
					case 5:
						System.out.println("Enter the new color ");
						make = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
						break;
					case 6:
						validValue = false;
						while (!validValue) {
							try {
								System.out.println("Please enter a Value for your Car");
								value = keyboard.nextDouble();
								while (value < 0) {
									System.out.println("Please enter a Value for your Car");
									value = Integer.parseInt(keyboard.nextLine());
									
								}
								
								validValue = true;
								break;
								
							}
							catch (InputMismatchException z) {
								System.out.println("Please Enter a valid price number");
								keyboard.nextLine();
								
							}	
						}
						System.out.println("Enter the new value ");
						make = keyboard.nextLine();
						//modifyCar(userSelection, vinNum, CarList)
					case 7:
						
					break;
					}
					
				} while(!quit); 
				
				
				//quit = false;
				//break;
			case 3:
				//For Deleting a Car
				//find the car 
				System.out.println("Please enter a Vin Number for the Car you want to delete");
				vinNum = keyboard.nextLine();
				//findCar(vinNum, carList)
				//ask user for stuff below
				//deleteCar(vinNum, carList); 
				
				//quit = false;
				break;
			case 4:
				System.out.println("Please enter a Vin Number for the Car you want to find");
				vinNum = keyboard.nextLine();
				//For Finding a Car
				//ask user for stuff below
				//findCar(vinNum,model,year,color,make,value, carList); 
				
				//quit = false;
				break;
			case 5:
				System.out.println("Please enter a Vin Number for the Car you want to sell");
				vinNum = keyboard.nextLine();
				// Recording Transactions needs the list of Transactions
				// findCar
				//recordTrans(vinNum,model,year,color,make,value,empNumber, TransList); 
				//deleteCar
				//quit = false;
				break;
			case 6:
				System.out.println("Displaying Your Sales Record");
				//DisplaySales(empNumber, carList); 
				
				//quit = false;
				break;
			case 7:
				System.out.println("Displaying Your Sales Record");
				//DisplayTotalSales(empNumber, carList); 
				
				//quit = false;
				break;
			case 8:
				
				quit = true;
				break;
			}
		
		
	} while(!quit); 
		System.out.println("Goodbye!");


			keyboard.close();
		
	}
}

