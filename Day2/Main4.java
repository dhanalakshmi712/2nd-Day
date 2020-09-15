Main.java


import java.util.Scanner;

class Player {
	String name;
	String country;
	String skill;
	Player(String name,String country,String skill)
	{
	this.name=name;
	this.country=country;
	this.skill=skill;
	
	
	}
	

}


public class Main{
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the details");
	String details=sc.next();
	String arr[]=new String[3];
	arr=details.split(",");
	Player p=new Player(arr[0],arr[1],arr[2]);
	System.out.println("player details");
	System.out.println(p.name);
	System.out.println(p.country);
	System.out.println(p.skill);
	
}
}
