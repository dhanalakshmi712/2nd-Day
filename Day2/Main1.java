2. Create a class named Player with the following  member variables / attributes  (Default access) 

Data Type

Variable Name

String

name

String

country

String

skill


Create another class named Main and write a main method to test the above class. 

  Input and Output Format: 
 Refer sample input and output for formatting specifications. 
All text in bold corresponds to input and the rest corresponds to output. 

 Sample Input and Output : 
Enter the player name 
MS Dhoni 
Enter the country name 
India 
Enter the skill 
All Rounder 
Player Details : 
Player Name : MS Dhoni 
Country Name : India 
Skill : All Rounder 

Saved as Main1.java
class Player
{
	String name="MS Dhoni";
	String country="India";
	String skill="All rounder";
	}
class Main1
{
	public static void main(String args[])
	{
		Player p=new Player();
		System.out.println("Player Details");
		System.out.println("Player Name:"+p.name+"\n"+"Country Name:"+p.country+"\n"+"Skill:"+p.skill);
	
	}
}