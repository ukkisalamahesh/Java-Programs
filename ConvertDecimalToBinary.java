import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String  binary = "";
		int count = 0;
		System.out.println("entera decimal value");
		int sen=s.nextInt();
		while(sen>0) {
			 int rem=sen%2;
			binary= rem+binary;
			 
			if(rem==1) {
				count++;
			} else {
				count=0;
			}
			sen=sen/2;
		}
		System.out.print( binary +"and count: "+count);
		
		
	StringBuilder s1= new StringBuilder(binary);
	System.out.println("the reverse bbinary value is :"+s1.reverse());
	
	int rever=0;
		char[] charArray = binary.toCharArray();
		int m=charArray.length-1;
		for (int i = 0; i < charArray.length; i++) {
			char ch=charArray[i];
		     int k=ch-48;
		    
			rever= rever+(k*(int)Math.pow(2,m));
		    m--;
			}
		System.out.println("decimal value equilant to reversed binary value is:"+rever);
		}
	
		}
		
		
	
	

		
		
		
	
		
	
	
	
	


