//���� N���� �̷���� ���� A�� ���� X�� �־�����. �̶�, A���� X���� ���� ���� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
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
