import java.util.Iterator;

public class ReplaceEven {
public static void main(String[] args) {
	String s="helloworld";
	char temp;
	System.out.println(s.length());
	if(s.length()%2==0) {
		char[] charArray = s.toCharArray();
		for (int i = 0; i <charArray.length-1; i+=2) {
			temp=charArray[i];
			charArray[i]=charArray[i+1];
			charArray[i+1]=temp;
					
					
					
				
			}
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		}
//int a=35;
//int b=35;
//int gcd = 0;
//for (int i = 1; i <=a; i++) {
//	if((a%i==0)&&(b%i==0)){
//		gcd=i;
//		System.out.println(gcd);
//	}
//
//}
//System.out.println("l"+gcd);
//int l =a*b/gcd;
//System.out.println(l);


		
	}
}


 	
		
		
			