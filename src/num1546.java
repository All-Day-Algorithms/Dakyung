/*
 �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
*/

import java.util.*;
public class num1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		double bests =0; //double�� �����! int �ƴ�!
		double total = 0;//double�� �����! int �ƴ�!
		
		double[] array1 = new double[N];
		for(int i=0;i<array1.length;i++) {
			array1[i] = scan.nextInt();
			if(array1[i] >= bests) {
				bests = array1[i];
			}
		}
		scan.close();
		
		for(int i=0;i<array1.length;i++) {	
			array1[i]= array1[i]/bests*100;
			total += array1[i];
		}
		System.out.println(total);
		double avg = total / N;
		System.out.println(avg);
	}	
}

