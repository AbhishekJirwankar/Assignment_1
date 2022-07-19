package revision;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		char op;
		Stirng ans="";
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter Your Name nas age: ");
		String num1 = next();
		num2 = reader.nextDouble();
		if(num2 > 18){
			op='v';	
		}
		else{
			op='i';
		}
		switch (op) {
		case 'v':
			ans = "You can vote..";
			break;
		case 'i':
			ans = "You cannot vote";
			break;
		default:
			System.out.printf("Error! Enter correct deatils");
			return;
		}
		System.out.print("\nThe result is given as follows:\n");
		System.out.printf(ans);
	}
}