//Sai Katkar
//September 18, 2025

import java.util.Scanner;
public class TimeTravelAdventure {

	public static void main(String[] args) {
		
		Scanner Key = new Scanner(System.in);
		
		//Asks the user for first choice (Past or Future)
		System.out.println("You are a scientist who has just built a time machine.");
		System.out.println("Do you want to travel in the PAST or FUTURE? (past/future)");
		
		String choice1 = Key.nextLine();
		
		//If the user chooses past
		if (choice1.equalsIgnoreCase("past")) 
		{
			System.out.println("You have arrived in the medieval times. Do you want to visit the castle or explore the forest? (castle/forest)");
			
			String choice2 = Key.nextLine();
			
			
			// If the user chooses Castle
			if (choice2.equalsIgnoreCase("castle")) 
			{
				System.out.println("The guards demand a bribe to enter. How many coins are you willing to offer? (Enter a number between 1-10) ");
				
				int coins = Key.nextInt();
				Key.nextLine();
				
				// Numeric comparison with multiple outcomes
				if ( coins < 5  && coins >= 1)
				{
					System.out.println("Too little! The guards lock you in the dungeon. GAME OVER!");
					
					
				}
				else if (coins == 5 ) 
				{
					System.out.println("The guards let you in, but you should stay alert while visiting the castle");
					
				}
				else if ( coins > 5  && coins <= 10)
					
				{
					System.out.println("Generous! The guards welcome you warmly, and you enter the castle ");
				}
				else {
					System.out.println("Invalid value entered");
					
				}
				
				//Forest
				
			}else if (choice2.equalsIgnoreCase("forest")) {
				System.out.println("You meet a wandering traveler who offers you two paths: a river trail or a cave path.(river/cave)");
				String choice3 = Key.nextLine();
				
				if (choice3.equalsIgnoreCase("river")) {
					System.out.println("You follow the river and discover your time machine washed ashore. You return home safely.");
				}
				else {
					System.out.println("You see your time machine in the cave! The cave collapses destroying the time machine, and you are trapped in time forever. GAME OVER!");
				}
				
			}
			
			
			// If the user chooses future
		}else if(choice1.equalsIgnoreCase("future")) {
			System.out.println("You arrive in a futuristic city ruled by AI and robots.");
			System.out.println("Do you want to enter the city or hide in the outskirts? (city/outskirts)");
			
			String choice2 = Key.nextLine();
			
			// If the user chooses future
			if (choice2.equalsIgnoreCase("city")) {
				System.out.println("Robots scan you and demand your energy credits. How many credits will you offer?");
				int credits = Key.nextInt();
				Key.nextLine();
				
				System.out.println("Do you recharge with an energy pack or a solar drink during the scan? (energy/solar)");
				String drink = Key.nextLine();
				
				if ((drink.equalsIgnoreCase("energy") || drink.equalsIgnoreCase("solar")) && credits > 5) {
					System.out.println("The robots accept your credits and grant you a citizen status. You thrive in the future.");
				}
				else {
					System.out.println("The robots reject you and exile you to the wastelands. You can never enter the city now! GAME OVER!");
				}
				
			}else if (choice2.equalsIgnoreCase("hide")) {   //If the user chooses to hide 
				
				// To join the rebel 
				System.out.println("You find a group of rebels planning to fight against the robots.");
				System.out.println("Do you want to join them or escape back to your time? (join/escape)");
				
				String choice3 = Key.nextLine();
				
				if (choice3.equalsIgnoreCase("join")) {
					System.out.println("You help the rebels defeat the robots, becoming a legend in the future.");
				}
				else {
					System.out.println("You escape using your time machine, returning safely but empty-handed.");
				}
			}
			
			
			// If the user enters invalid choice
		}else {
			System.out.println("You hesitate too long, and the time machine malfunctions. You are lost in the void of time.");
		}
		
			
	}

}
