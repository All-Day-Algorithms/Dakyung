/*���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.*/
import java.util.Scanner;
public class num1157 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, most=0,alpha =0;//����Ʈ�� ���� �ε���
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
		System.out.println((char)(list[most]+65));
	}
}

