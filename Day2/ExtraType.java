ExtraType.java

public class ExtraType {
private String name;
private long runs;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getRuns() {
	return runs;
}
public void setRuns(long runs) {
	this.runs = runs;
}
ExtraType()
{
	
}
}
  
Main2.java
 
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		System.out.println("Enter the extratype details");
		Scanner sc=new Scanner(System.in);
		String detail=sc.next();
		String arr[]=new String[2];
		arr=detail.split("#");
    ExtraType e=new ExtraType();
    e.setName(arr[0]);
    System.out.println(e.getName());
	e.setRuns(Long.parseLong(arr[1]));
	System.out.println(e.getRuns());

	}

}
 