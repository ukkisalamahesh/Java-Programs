

public class DisArmNumber {
static int sum=0;
public static void main(String[] args) {
	int n=135; int count=0;int num=n;
	while(n!=0) {
		n=n/10;
		count++;
	}
 int sum2=disarm(num,count);
 if(sum2==num) {
	 System.out.print("the number is disarm number");
 }else {
	 System.out.println("the number is not disarm number");
 }
}
private static int  disarm(int n, int count) {
if(n!=0) {
	sum+=Math.pow(n%10, count);
	
	disarm(n/10,--count);
	}
	return sum;
}
}

