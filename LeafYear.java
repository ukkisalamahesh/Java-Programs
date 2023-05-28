import java.util.Scanner;

public class LeafYear {
public static void main(String[] args) {
	boolean l=false;
	Scanner s =new Scanner(System.in);
	System.out.println("enter a number");
	int num=s.nextInt();
	if(num%4==0) {
		if(num%100==0) {
			if(num%400==0) {
				l= true;
			}
			else 
				l=false;
			
			
		}
		else 
			l=true;
		
	}else 
		l=false;
	
		if(l) {
			System.out.println("leaf");
		} else {
			System.out.println("not leaf");
		}
	}
	
}
