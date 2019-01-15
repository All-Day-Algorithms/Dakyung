import java.util.Scanner;
public class num2739 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num =scan.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.printf("%d * %d= %d%n",num,i,i*num);
		}
	}
}
