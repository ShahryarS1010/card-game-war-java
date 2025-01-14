// This Program is the Card Game War.
//package JavaPackage;

//Import to be able to get input and catch exceptions
import java.util.*;


public class Card_Game_War 
{
	public static void main(String[] args) 
	{
		// Declare a Scanner variable to get input.
		Scanner input = new Scanner(System.in);
							
		// Declare a variable that will decide whether to repeat a program or not (1 Is Yes, 0 is No).
		int repeatInt = 1;
							
		// Declare a variable that will check if a user wants to try the program again.
		boolean repeatProgram = true;
							
		// Declare a variable that will return to the beginning of the program if the user inputs an invalid choice
		boolean validChoice = false;
						
					
		while(repeatInt == 1) 
		{	
			
			// Welcome Message 
			System.out.println("Welcome to War (Card Game)");
			
			// Declare a variable to decide if the game continues or quit;
			int play_game = 1;
			
			// Declare variable to hold the card the player and computer dealt.
			Card human_card;
			Card computer_card;
			
			// Declare a variable to hold the player's name;
			String player_name = "";
			
			// Ask for the player's name;
			System.out.println("Enter your name: ");
			player_name = input.nextLine();
			
			// Create player objects for human and computer.
			Player human = new Player(player_name);
			Player computer = new Player("Computer");
			
			// Create an arraylist to hold the decks.
			ArrayList<Card> deck = new ArrayList<Card>();
			
			// Create objects for all the cards (2 is the lowest card value and Ace is the highest card value).
			Card card2c = new Card(2, '2');
			Card card2d = new Card(2, '2');
			Card card2h = new Card(2, '2');
			Card card2s = new Card(2, '2');
			
			Card card3c = new Card(3, '3');
			Card card3d = new Card(3, '3');
			Card card3h = new Card(3, '3');
			Card card3s = new Card(3, '3');
			
			Card card4c = new Card(4, '4');
			Card card4d = new Card(4, '4');
			Card card4h = new Card(4, '4');
			Card card4s = new Card(4, '4');
			
			Card card5c = new Card(5, '5');
			Card card5d = new Card(5, '5');
			Card card5h = new Card(5, '5');
			Card card5s = new Card(5, '5');
			
			Card card6c = new Card(6, '6');
			Card card6d = new Card(6, '6');
			Card card6h = new Card(6, '6');
			Card card6s = new Card(6, '6');
			
			Card card7c = new Card(7, '7');
			Card card7d = new Card(7, '7');
			Card card7h = new Card(7, '7');
			Card card7s = new Card(7, '7');
			
			Card card8c = new Card(8, '8');
			Card card8d = new Card(8, '8');
			Card card8h = new Card(8, '8');
			Card card8s = new Card(8, '8');
			
			Card card9c = new Card(9, '9');
			Card card9d = new Card(9, '9');
			Card card9h = new Card(9, '9');
			Card card9s = new Card(9, '9');
			
			Card card10c = new Card(10, 'X');
			Card card10d = new Card(10, 'X');
			Card card10h = new Card(10, 'X');
			Card card10s = new Card(10, 'X');
			
			Card cardJc = new Card(11, 'J');
			Card cardJd = new Card(11, 'J');
			Card cardJh = new Card(11, 'J');
			Card cardJs = new Card(11, 'J');
			
			Card cardQc = new Card(12, 'Q');
			Card cardQd = new Card(12, 'Q');
			Card cardQh = new Card(12, 'Q');
			Card cardQs = new Card(12, 'Q');
			
			Card cardKc = new Card(13, 'K');
			Card cardKd = new Card(13, 'K');
			Card cardKh = new Card(13, 'K');
			Card cardKs = new Card(13, 'K');
			
			Card cardAc = new Card(14, 'A');
			Card cardAd = new Card(14, 'A');
			Card cardAh = new Card(14, 'A');
			Card cardAs = new Card(14, 'A');
			
			// Add all the cards to the deck.
			deck.add(card2c);
			deck.add(card2d);
			deck.add(card2h);
			deck.add(card2s);
			
			deck.add(card3c);
			deck.add(card3d);
			deck.add(card3h);
			deck.add(card3s);
			
			deck.add(card4c);
			deck.add(card4d);
			deck.add(card4h);
			deck.add(card4s);
			
			deck.add(card5c);
			deck.add(card5d);
			deck.add(card5h);
			deck.add(card5s);
			
			deck.add(card6c);
			deck.add(card6d);
			deck.add(card6h);
			deck.add(card6s);
			
			deck.add(card7c);
			deck.add(card7d);
			deck.add(card7h);
			deck.add(card7s);
			
			deck.add(card8c);
			deck.add(card8d);
			deck.add(card8h);
			deck.add(card8s);
			
			deck.add(card9c);
			deck.add(card9d);
			deck.add(card9h);
			deck.add(card9s);
			
			deck.add(card10c);
			deck.add(card10d);
			deck.add(card10h);
			deck.add(card10s);
			
			deck.add(cardJc);
			deck.add(cardJd);
			deck.add(cardJh);
			deck.add(cardJs);
			
			deck.add(cardQc);
			deck.add(cardQd);
			deck.add(cardQh);
			deck.add(cardQs);
			
			deck.add(cardKc);
			deck.add(cardKd);
			deck.add(cardKh);
			deck.add(cardKs);
			
			deck.add(cardAc);
			deck.add(cardAd);
			deck.add(cardAh);
			deck.add(cardAs);
			
			// Give two cards to the player and computer to demonstrate when a war happens in the program.
			human.addCard(deck.get(4));
			human.addCard(deck.get(0));
			computer.addCard(deck.get(1));
			computer.addCard(deck.get(2));
			
			// Remove the card out of the deck as they were given to the player.
			deck.remove(4);
			deck.remove(0);
			deck.remove(0);
			deck.remove(0);
			
			// Shuffle the deck.
			Collections.shuffle(deck);
			
			// Give an equal amount of cards to the player and computer.
			for (int i = 0; i < 24; i++)
			{
				human.addCard(deck.get(0));
				deck.remove(0);
			}
			
			for (int i = 0; i < 24; i++)
			{
				computer.addCard(deck.get(0));
				deck.remove(0);
			}
			
			System.out.println("26 cards have been given to each player.");
			
			// Start the Game
			while (true)
			{
				System.out.println(human.getName() + " has " + human.getcardamount() + " cards");
				System.out.println(computer.getName() + " has " + computer.getcardamount() + " cards");
				
				// The winner is the player who collect all 52 cards.
				if (human.getcardamount() == 52)
				{
					System.out.println(human.getName() + " has won the game.");
				}
				
				if (computer.getcardamount() == 52)
				{
					System.out.println(computer.getName() + " has won the game.");
				}
				
				
				try 
				{
					// Ask the player if he wants to keep playing or quit.
					System.out.println("What will you do? 1) Play  0) Quit");
					play_game = input.nextInt();
					if (play_game == 0)
					{
						break;
					}
					
					if (play_game < 0 || play_game > 1)
					{
						System.out.println("Error, Invalid Input");
						play_game = 1;
						continue;
					}
				}
				
				catch (Exception invalid_input)
				{
					System.out.println("Error, Invalid Input");
					play_game = 1;
					input.nextLine();
					continue;
				}
				
				// Both human and computer deal a card.
				
				System.out.print(human.getName() + "'s card is: ");
				human_card = human.getcard(0);
				System.out.println(human_card.getName());
				deck.add(human_card);
				human.removeCard();
				
				System.out.print(computer.getName() + "'s card is: ");
				computer_card = computer.getcard(0);
				System.out.println(computer_card.getName());
				deck.add(computer_card);
				computer.removeCard();
				
				// Human wins the cards.
				if (human_card.getValue() > computer_card.getValue())
				{
					
					if (deck.size() > 2)
					{
						System.out.println(human.getName() + " has won the war.");
					}
					
					else 
					{
						System.out.println(human.getName() + " has won the cards.");
					}
					
					for (int i = 0; i < deck.size(); i++)
					{
						human.addCard(deck.get(i));
					}
					deck.clear();
				}
				
				// Computer wins the cards
				else if (computer_card.getValue() > human_card.getValue())
				{
					
					if (deck.size() > 2)
					{
						System.out.println(computer.getName() + " has won the war.");
					}
					
					else 
					{
						System.out.println(computer.getName() + " has won the cards.");
					}
					
					for (int i = 0; i < deck.size(); i++)
					{
						computer.addCard(deck.get(i));
					}
					deck.clear();
				}
				
				// The cards are of equal value so there is war.
				else if (human_card.getValue() == computer_card.getValue())
				{
					System.out.println("War, Both Players deal 3 cards and the next card dealt will determine who wins the war and all the cards.");
					
					// The human and computer each deal 3 cards each.
					human_card = human.getcard(0);
					deck.add(human_card);
					human.removeCard();
					human_card = human.getcard(0);
					deck.add(human_card);
					human.removeCard();
					human_card = human.getcard(0);
					deck.add(human_card);
					human.removeCard();
					
					computer_card = computer.getcard(0);
					deck.add(computer_card);
					computer.removeCard();
					computer_card = computer.getcard(0);
					deck.add(computer_card);
					computer.removeCard();
					computer_card = computer.getcard(0);
					deck.add(computer_card);
					computer.removeCard();
					
					// The next card that is dealt will win the war and all the cards.
				}
				
			}
			
			System.out.println("Thanks for Playing.");	
				
			while(repeatProgram == true) 
			{
				// Ask the user if he wants to try to exit or try again.
				try 
				{
					System.out.print("Repeat program (type 1 for yes or 0 for no)?: ");
					repeatInt = input.nextInt();
					if (repeatInt < 0 || repeatInt > 1)
					{
						System.out.println("Error, enter either 0 or 1");
					}
						
					else
					{
						repeatProgram = false;
						input.nextLine();
					}
						
				}
	    
				// Validate input.
				catch(Exception invalid_input)
				{
					// If the user gives improper input then state the error and allow the user to re-input
					System.out.println("An exception was thrown due to an invalid input. ");
					repeatProgram = true;
					input.nextLine();
			
				}		
			}
		}
			
		
	}
}

