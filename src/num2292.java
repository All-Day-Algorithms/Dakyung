import java.util.*;
public class num2292 {

	public static void main(String[] args) {
		int num=0;
		int total=1, count = 1;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt(); //������ ��
		
		while(total <num) {
			total +=count*6;
			count++; 
		}
		System.out.println(count);
	}
}


/*
58���� 5�� �������� �ϴ� 4�� �����ϸ� 61�ε�, count++ �� �� �����ؼ� count�� 5���ȴ����� 
�� �����Ϸ����ϱ� total>num�̶� break!
���� 5�� ������ ��! 
*/