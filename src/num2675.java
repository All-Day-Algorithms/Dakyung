/*
 ���ڿ� S�� �Է¹��� �Ŀ�, �� ���ڸ� R�� �ݺ��� �� ���ڿ� P�� ���� �� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, ù ��° ���ڸ� R�� �ݺ��ϰ�, �� ��° ���ڸ� R�� �ݺ��ϴ� ������ P�� ����� �ȴ�.
 ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. 
 */
import java.util.Scanner;
public class num2675 {

	public static void main(String[] args) {
		int t,num =0;
		String sentence =null;
		Scanner scan = new Scanner(System.in);
		t = scan.nextInt(); //�� ��
		for(int i=0; i<t;i++) {
			num = scan.nextInt();
			sentence = scan.next(); 
			for(int k =0; k<sentence.length();k++) {
				for(int j=0;j<num;j++) {
					System.out.print(sentence.charAt(k));
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
