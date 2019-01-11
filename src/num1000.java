import java.util.*;

public class num1000 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 두 개를 입력하세요.");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();
		
		System.out.println(num1+num2);
	}
}
