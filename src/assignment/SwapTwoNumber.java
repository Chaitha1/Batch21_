package assignment;
import java.util.*;
public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;  
		Scanner scanner = new Scanner(System.in);  {
		System.out.print("Enter the first number: ");  
		a = scanner.nextInt();  
		System.out.print("Enter the second number: ");  
		b = scanner.nextInt();  
		System.out.println("Before swapping:");  
		System.out.println("a = " +a +", b = " +b);  
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		System.out.println("After swapping:");  
		System.out.print("a = " +a +", b = " +b);  
		}

	}

}
