/*���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.*/
import java.util.Scanner;
public class num1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, most=0;
		int count=0,alpha =0, most_index=0;//����Ʈ�� ���� �ε���
		boolean what =false;
		//���ĺ� ����Ʈ ����
		int[] list =new int[26]; //���ĺ�����Ʈ
		for(int k=0;k<26;k++) { //����Ʈ �ʱ�ȭ
			list[k] =-1;
		}
		
		String input = scan.next(); //�Է�
		
		for(int k=0; k<input.length();k++) {	
			alpha = (int)(input.charAt(k)); //���ĺ� �ѱ��ھ�
			if(alpha >= 97) {
				num = alpha - 97 ;
			}else {
				num = alpha - 65;
			}
			list[num]++; //�ش��ε����� +1
		}
		
		for(int k=0; k<26;k++) {
			if(list[k]> most) {
				most=list[k];
			}
		}
		for(int k=0; k<26;k++) {
			if(most == list[k]) {
				count ++;
				most_index=k;
			}
		}
		
		if(count >1) {
			what = true;
		}
		if(what == true) {
			System.out.println("?");
		}else {
			System.out.println((char)(most_index+65));
		}
	}
}

