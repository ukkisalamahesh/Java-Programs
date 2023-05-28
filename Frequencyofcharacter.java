import java.util.*;
import java.util.Scanner;

public class Frequencyofcharacter {
public static void main(String[] args) {

//HashMap<String,Integer> h=new HashMap();
//String ss="mahesh mani vinay dam mani hell";
//String[] split = ss.split(" ");
//for (int i = 0; i < split.length; i++) {
//	if(h.containsKey(split[i])) {
//		int count=h.get(split[i]);
//		h.put(split[i],count+1);
//	}else {
//		h.put(split[i],1);
//	}
	
////}
////System.out.println(h);
String s="maheshhsss";
int fr[]=new int[s.length()];
char[] charArray = s.toCharArray();
for (int i = 0; i < charArray.length; i++) {
	fr[i]=1;
	for (int j =i+1; j < charArray.length; j++) {
		
		if(charArray[i]==charArray[j]) {
			fr[i]++;
			charArray[j]=' ';
      		}
		}
	}
for (int i = 0; i < fr.length; i++) {
	if(charArray[i]!=0&&charArray[i]!=' ') {
		System.out.println(fr[i]+" "+charArray[i]);
	}
}
}
}



	


