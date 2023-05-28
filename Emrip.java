
public class Emrip {
public static void main(String[] args) {
	int n=175; int num=n;
	 int count=count(n); int sum=0;int rem=0;
	 while(n!=0) {
		rem=n%10;
		sum=(int) (sum+Math.pow(rem, count));
		n=n/10;
		count--;
	}
	if(sum==num) {
		System.out.println("emrip");
	}else {
		System.out.println("not");
	}
	}

private static int count(int n) {
	int count=0;
	while(n!=0) {
		n=n/10;
		count++;
	}
	return count;

	
}
}
