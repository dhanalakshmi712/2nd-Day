
 saved as Main3.java
 import java.util.Scanner;
class Venue{
	private String name;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	Venue()
	{
		
	}
}
public class Main3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the venue name");
	String venue=sc.next();
	System.out.println("Enter the city name");
	String city=sc.next();
	Venue v=new Venue();
	while(true)
	{
	System.out.println("Venue details");
	v.setName(venue);
	System.out.print(v.getName());
	v.setCity(city);
	System.out.print(v.getCity());
	System.out.println("Menu");
	System.out.println("1.Update Venue Name \n 2.Update City Name \n 3.All informations Correct/Exit \n Type 1 or 2 or 3 ");
	int c=sc.nextInt();
	switch(c)
	{
	case 1:
	
	System.out.println("enter the venue name");
	sc.next();
	String name=sc.next();
	v.setName(name);
	break;
	case 2:
		
		System.out.println("enter the city name");
		sc.next();
		String cityname=sc.next();
		v.setName(cityname);
		break;
		
	case 3:
		System.exit(0);
		break;
	}
	
	
	
}
}
}
