/*
 ����5. ������ ������ �Ű������� �޾Ƽ�
  ���� ū ���� ��ȯ�ϴ� �޼����
  ���� ���� ���� ��ȯ�ϴ� �޼��带 �����ؼ� ����غ�����
 * */
import java.util.*;
public class bit_hw_0310_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int large=0, small =0;
		large =largenum(num1,num2,num3);
		small = smallnum(num1,num2,num3);
		
		System.out.println(large);
		System.out.println(small);
	}
	
	public static int largenum(int num1, int num2, int num3) {
		int large=0;
		if(num1 > num2) {
			if(num1 >num3) {
				large = num1;
			}else {
				large = num2;
			}
		}else {
			if(num2>num3) {
				large = num2;
			}else {
				large = num3;
			}
		}
		
		return large;
		
	}
	
	public static int smallnum(int num1, int num2, int num3) {
		int small = 0;
		
		if(num1 < num2) {
			if(num1 <num3) {
				small = num1;
			}else {
				small = num2;
			}
		}else {
			if(num2<num3) {
				small = num2;
			}else {
				small = num3;
			}
		}
		
		return small;
		
	}

}



	

