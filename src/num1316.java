/*
 �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�. 
 ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������, aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
�ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.*;
public class num1316 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int score =num;
		for(int i=0;i<num;i++) {
			String word = scan.next();
			boolean[] checkalp =new boolean[27];
			
			for(int k=1; k<word.length();k++) {
				if(word.charAt(k-1) != word.charAt(k)) {//���� ���ڶ� ������ڶ� ������ Ȯ��
					if(checkalp[word.charAt(k)-97] ==true) { //�ٸ��� ������ڰ� ������ ���Դ��� Ȯ��
						score --; //�������� ���ڿ��� ���� ��
						break;
					}
					checkalp[word.charAt(k-1)-97]=true; //�ϴ� �������ڴ� ���°��ڳ� ? �׷��ϱ� üũ�ؾ��� 
				}
			}
		}
		System.out.println(score);
	}
}
