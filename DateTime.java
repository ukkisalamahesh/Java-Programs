import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class DateTime {
public static void main(String[] args)  {
	int arr[]= {1,2,3,4};
	
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]);
		}
	System.out.println();
	int temp=arr[0];
	arr[0]=arr[arr.length-1]; 
	arr[arr.length-1]=temp;
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
	
	
	ArrayList a=new ArrayList();
	
	a.add("java");
	a.add("manual");
	a.add("java");
	a.add("hello");
	System.out.println(a);
	ArrayList a1=new ArrayList();
	for (Object object : a) {
		if(a1.indexOf(object)==-1) {
			a1.add(object);
	}
	}
	System.out.println(a1);
	
//	a.set(0,"testing");
//	System.out.println(a);
//StringBuffer s=new StringBuffer();
//StringBuffer s1=new StringBuffer();
//	int arr[]= {5,1,3,1,4,2,1};
//	for (int i =0; i < arr.length; i++) {
//		if(arr[i]==1) {
//		s.append(arr[i]);
//		}else {
//			s1.append(arr[i]);
//		}
//		
//	}
//	System.out.println(s);
//	System.out.println(s1.append(s));
//	
//	sec(arr);
//int max=arr[0];
//int min=arr[0];
//
//for (int i = 0; i < arr.length; i++) {
//	if(arr[i]>max) {
//		
//		max=arr[i];
//	}
//	
//	if(arr[i]<min) {
//		min=arr[i];
//	}
//	
//}
//System.out.println(max);
//System.out.println(min);
//	String s="03/04/2023";
//	java.util.Date sim = new SimpleDateFormat("dd/MM/yyyy").parse(s);
//	System.out.println(sim);
//	ArrayList<Integer> a1=new ArrayList();
//	a1.add(10);
//	a1.add(20);
//	a1.add(30);
//	a1.add(40);
//	 int min =Collections.max(a1);
//	 System.out.println(min);
	
//	ArrayList<String> a=new ArrayList<String>();
//	a.add("hello");
//	a.add("Aim");
//	a.add("cam");
//	a.add("baba");
//	a.add("cam");
//	System.out.println(a.retainAll(a));
//	for (String string : a) {
//		System.out.println(string+":"+Collections.frequency(a, string));
//	
//	}
	
//	Collections.sort(a);
//	Collections.sort(a,Collections.reverseOrder());
//	System.out.println(a);
//	System.out.println(a.contains("baba"));
//	List<String> collect = a.stream().distinct().collect(Collectors.toList());
//	System.out.println(collect);
	//
//	int max=(int) Collections.max(t.values());
//	System.out.println(max);
//	String s="welcomre@to@split";
//	
//	for (String string : s.split("@",)) {
//		System.out.println(string);
//	}

	
}

private static void sec(int[] arr) {
	
	Arrays.sort(arr);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
		
	}
	System.out.println();
	System.out.println(arr[2]);
	
	
}
}
