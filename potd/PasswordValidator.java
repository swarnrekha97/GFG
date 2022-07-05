import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public static void main(String[] args) {
		//String input="oH1";
		Pattern p= Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])");
		Scanner in = new Scanner(System.in);
		int n= in.nextInt();
		String[] input = new String[n];
		//int i=0;
		for(int i=0;i<n;i++) {
			//System.out.println(i);
			input[i]= in.next();;
			//i++;
		}
		//System.out.println(input);
		for(int j=0;j<n;j++) {
			if(input[j].matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$")) {
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
	}
		//System.out.println(input.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9]).*$"));
	
}
