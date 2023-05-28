import java.util.Stack;
public class ReverseParticularWordinSentence {
public static void main(String[] args) {

String s="mahesh hello how are you";

String req="hello";
String[] split = s.split(" ");
for (String string : split) {
	String rev="";
	if(string.equals(req)) {
		for (int i =string.length()-1; i>=0; i--) {
			rev+=string.charAt(i);
		}
		string =rev;
	}
	System.out.print(string+" ");
	
}



}
	
}

