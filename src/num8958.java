/*
 "OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.*;
public class num8958 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String[] list = new String[num];
		
		for(int i=0;i<num;i++) {
			list[i] = scan.next(); //�Է¹ޱ�
		}
		
		for(int i=0;i<list.length;i++) {
			int total=0;
			int plus=0;
			for(int k=0;k<list[i].length();k++) {
				if(list[i].charAt(k)=='O') {
					total += ++plus;  //���� o�� �ѹ� �� ���ؾ��ϴϱ� ���⼭ plus �����ϱ�!
				}else {
					plus =0;
				}
			}
			System.out.println(total);
		}
	}
}


/*
 length --- arrays (int[], double[], String[]) ---- �迭�� ���̸� �˷� �Ҷ� ����Ѵ�.
length() --- String related Object (String, StringBuilder etc) - �̰��� ���ڿ��� ���̸� �˰��� �Ҷ� ���ȴ�.
size() --- Collection Object (ArrayList, Set etc) �÷��� Ÿ���� ���̸� Ȯ���Ҷ� ���ȴ�.
 */
 