/*
����6. ����ڷκ��� �ʸ� �Է¹��� ��
  �� �ʸ� [�ð�, ��, ��]�� ����ϴ� �޼��带 �����ؼ�
  ����غ�����
  ���� ��� 3672�� �Է��ϸ� [1�ð�, 1��, 12��]�� 
  ����ϸ� �˴ϴ�
*/
import java.util.*;
public class bit_hw_0310_3 {
	public static void main(String[] args) {
		int time =0, hour =0;
		int min =0, sec =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ʸ� �Է��ϼ���.");
		time = scan.nextInt();
		
		hour = hour(time);
		min = min(time);
		sec = sec(time);
		
		System.out.println("[" + hour + "�ð�, " + min + "�� , "+sec+"��]");
	}
	
	public static int hour(int time) {
		int hour =0;
		hour = time / 3600;
		
		return hour;
	}
	
	public static int min(int time) {
		int min =0;
		min = time / 60;
		if(min >=60) {
			min = min- 60;
		}
		
		return min;
	}
	
	public static int sec(int time) {
		int sec =0;
		sec = time % 60;
		
		return sec;
	}
	

}
