import java.util.Stack;
public class barf {
public static void main(String[] args) {
	System.out.println(reverseMe("IKTFBEh_CY1=v?hctaw/moc.ebutuoy"));
}
public static String reverseMe(String input){
	String output = "";
	Stack reverser = new Stack();
	for (int i = 0; i < input.length(); i++) {
		reverser.push(input.charAt(i));
	}
	for (int i = 0; i < input.length(); i++) {
		output += reverser.pop();
	}
	return output;
}
}
