//package JavaPackage;

public class Card 
{
	
	int value;
	char name;

	Card(int given_value, char given_name) 
	{
		value = given_value;
		name = given_name;
	}
	
	
	void setValue(int given_value) 
	{
		value = given_value;
	}
	
	int getValue() 
	{
		return value;
	}
	

	void setName(char given_name) 
	{
		name = given_name;
	}
	
	char getName() 
	{
		return name;
	}
	
}
