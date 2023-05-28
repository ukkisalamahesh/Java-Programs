import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
public static void main(String[] args) {

   char s1[]= {'h','e','a','r','t'};
   char s2[]= {'e','a','r','t','h'};
   if(anagram(s1,s2)) {
	   System.out.println("anagram");
   }else {
	   System.out.println("not anagram");
   }
	}

private static boolean anagram(char[] s1, char[] s2) {
	int n1=s1.length;
	int n2=s1.length;
	if(n1!=n2) {
		return false;
	}
	Arrays.sort(s1);
	Arrays.sort(s2);
	for (int i = 0; i < s1.length; i++) {
		if(s1[i]!=s2[i]) {
		return false;	
		}
	}
	return true;
		
}
}