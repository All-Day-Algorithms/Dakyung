//���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. ������ ���ĺ��� ���ؼ�, �ܾ ���ԵǾ� �ִ� ��쿡�� ó�� �����ϴ� ��ġ��, ���ԵǾ� ���� ���� ��쿡�� -1�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;
public class num10809 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list =new int[26]; //���ĺ�����Ʈ
		for(int k=0;k<26;k++) { //����Ʈ �ʱ�ȭ
			list[k] =-1;
		}
		
		String input = scan.next();
		for(int k=0; k<input.length();k++) {
			char alpha = input.charAt(k); //���ĺ� �ѱ��ھ�
			int change =(int)alpha -97; //����Ʈ üũ�ϱ� ���ؼ� ����
			int where = input.indexOf(alpha); //���ĺ� ��ġ
			list[change] = where;
		}
		
		for(int k=0;k<26;k++) {
			System.out.println(list[k]);
		}
		scan.close();
	}
}
