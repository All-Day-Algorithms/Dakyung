/*
 �������� c d e f g a b C, �� 8�� ������ �̷�����ִ�. �� �������� 8�� ���� ������ ���� ���ڷ� �ٲپ� ǥ���Ѵ�. c�� 1��, d�� 2��, ..., C�� 8�� �ٲ۴�.
1���� 8���� ���ʴ�� �����Ѵٸ� ascending, 8���� 1���� ���ʴ�� �����Ѵٸ� descending, �� �� �ƴ϶�� mixed �̴�.
������ ������ �־����� ��, �̰��� ascending����, descending����, �ƴϸ� mixed���� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.*;
public class num2920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[8];
		int result =0;
		
		for(int i=0;i<8;i++) {
			list[i] = scan.nextInt();
		}
		scan.close();
        
		for(int i =0; i<7; i++) {
			if(list[i]+1==list[i+1]) {
				result =1;
			}else if(list[i+1]+1==list[i]) {
				result =2;
			}else {
				result =3;
				break; //�ƴҶ� ��������!!
			}
		}
		if(result == 1) {
			System.out.println("ascending");
		}else if(result ==2) {
			System.out.println("descending");
		}else {
			System.out.println("mixed");
		}
	}
}

/*
public class num2920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = new int[8];
		for(int i=0;i<8;i++) {
			list[i] = scan.nextInt();
		}
		scan.close();
		for(int i =0; i<8; i++) {
			if(list[i]+1==list[i+1]) {
				System.out.println("ascending");
			}else if(list[i+1]-1==list[i]) {
				System.out.println("descending");
			}else {
				System.out.println("mixed");
				break;
			}
		}
	}
}


*/
