/*
 �����̰� ����ġ�� ������ �� ���� ������ �������� ����, ����, ���, ��, �����̴�.���� �� ������ �⸻��簡 �־���, �����̴� ���� �л����� �⸻��� �������� ä���ϰ� �ִ�. 
 �⸻��� ������ 40�� �̻��� �л����� �� ���� �״�� �ڽ��� ������ �ȴ�. ������, 40�� �̸��� �л����� �����н��� ��� ������ �����ϸ� 40���� �ް� �ȴ�. �����н��� �ź��� �� ���� ������, 40�� �̸��� �л����� �׻� 40���� �ް� �ȴ�.
�л� 5���� ������ �־����� ��, ��� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.*;
public class num10039 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list =new int[5];
		int score =0;
		int result =0;
		
		for(int i=0; i<5;i++) {
			list[i] =scan.nextInt();
		}
		
		for(int i=0; i<5;i++) {
			if(list[i]>=40) {
				score += list[i];
			}else {
				score += 40;
			}
		}
		result = score/5;
		System.out.println(result);
		
	}

}
