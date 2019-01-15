import java.util.Scanner;

public class num10817 {

	public static void main(String[] args) {
		int a,b,c =0; 
		
		Scanner scan =new Scanner(System.in);
		a =scan.nextInt();
		b =scan.nextInt();
		c =scan.nextInt();
		
		if(a > b) {
			if(a<=c) {
				System.out.println(a);
			}else {
				if(b>=c) {
					System.out.println(b);
				}else {
					System.out.println(c);
				}
			}
		}else {
			if(b<=c) {
				System.out.println(b);
			}else {
				if(a>=c) {
					System.out.println(a);
				}else {
					System.out.println(c);
				}
			}
		}
	}
}
