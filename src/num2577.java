/*
 �� ���� �ڿ��� A, B, C�� �־��� �� A��B��C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ��� A = 150, B = 266, C = 427 �̶�� 
A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, 
����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
 */

import java.util.*;
public class num2577 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int total = a * b * c;
		
		String num = Integer.toString(total); //int�� string����
		char[] ch= num.toCharArray(); //string�� char�� 
		char [] arraynum = new char[num.length()];
		int [] numcount = new int[10];

		for(int i =0;i<arraynum.length;i++) {
			arraynum[i]=num.charAt(i);
			numcount[arraynum[i]-'0']+=1; // char �� ���ڸ� int �� ������ ��ȯ�ϱ� ���� '0' �� ����
		}
		
		for(int i =0;i<numcount.length;i++) {
			System.out.println(numcount[i]);
		}
	}
}
