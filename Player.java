//package JavaPackage;

import java.util.ArrayList;

public class Player 
{

	String name;
	ArrayList<Card> hand = new ArrayList<Card>();
	
	
	Player(String given_name) 
	{
		name = given_name;
	
	}
	
	
	void setName(String given_name) 
	{
		name = given_name;
	}
	
	void addCard(Card given_card) 
	{
		hand.add(given_card);
	}
	
	void removeCard()
	{
		hand.remove(0);
	}
	
	
	String getName()
	{
		return name;
	}
	
	Card getcard(int card_index) 
	{
	
		return hand.get(card_index);
		
	}
	
	int getcardamount()
	{
		
		return hand.size();
	}
	
	
	
	
	
}
