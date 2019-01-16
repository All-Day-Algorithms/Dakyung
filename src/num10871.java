//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
import java.util.*;

public class num10871 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		int X =scan.nextInt();
		
		int[] array1 = new int[N];
		for(int i=0;i<array1.length;i++) {
			array1[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]<X) {
				System.out.print(array1[i]+" ");
			}
		}

	}

}
