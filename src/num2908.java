/*
 ������� ���� ����� ������ ���� ���Ѵ�. ����� ���ڸ� �дµ� ������ �ִ�. �̷��� ������ ���ϴ� ����� ���ؼ� ����̴� ���� ũ�⸦ ���ϴ� ������ ���־���. 
 ����̴� �� �ڸ� �� �� ���� ĥ�ǿ� ���־���. �� ������ ũ�Ⱑ ū ���� ���غ���� �ߴ�.
����� ���� �ٸ� ����� �ٸ��� �Ųٷ� �д´�. ���� ���, 734�� 893�� ĥ�ǿ� �����ٸ�, ����� �� ���� 437�� 398�� �д´�. ����, ����� �� ���� ū ���� 437�� ū ����� ���� ���̴�.
�� ���� �־����� ��, ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class num2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2 =0;
		int[] list = new int[6];
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		int new1 = (num1%10)*100 + ((num1%100)/10)*10 + (num1/100);
		int new2 = (num2%10)*100 + ((num2%100)/10)*10 + (num2/100);
		
		if(new1>new2) {
			System.out.println(new1);
		}else {
			System.out.println(new2);
		}
	}

}
