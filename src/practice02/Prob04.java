package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] charArray = new char[str.length()];

		int num = str.length();

		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = str.charAt(num - i - 1);
		}
		return charArray;
	}

	public static void printCharArray(char a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
		System.out.println("");
	}
}
