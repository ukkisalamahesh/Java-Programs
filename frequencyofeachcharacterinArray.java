
public class frequencyofeachcharacterinArray {
public static void main(String[] args) {
	
	int arr[]= {12,3,4,4,5}; int fr[]=new int[arr.length];
	for (int i = 0; i < arr.length; i++) {
		 fr[i]=1;
		for (int j =i+1; j <arr.length; j++) {
			if(arr[i]==arr[j]) {
				fr[i]++;
			arr[j]=0;
			}
			}
	}
 for (int j = 0; j < fr.length; j++) {
		if(arr[j]!=0&&arr[j]!=' ') {
			System.out.println(fr[j]+" "+arr[j]);
		}
	}
}
}