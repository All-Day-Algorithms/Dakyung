import java.util.Scanner;
public class num10430 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		int num1 =scan.nextInt();
		int num2 = scan.nextInt();
		int num3 =scan.nextInt();
		scan.close();
		
		System.out.println((num1 + num2)%num3);
		System.out.println((num1%num3+num2%num3)%num3);
		System.out.println((num1*num2)%num3);
		System.out.println((num1%num3)*(num2%num3)%num3);

	}
}
