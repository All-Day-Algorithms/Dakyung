//���� ����
import java.util.Scanner;

public class num2750 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] result = new int[5];
		result = InputArray(scan);
		result = AscArray(result);
		for(int i =0; i<5; i++) {
			System.out.println(result[i]);
		}
	}
	
	
//	//�Է� �޼���
	public static int[] InputArray(Scanner scan) {
		int[] inputnum = new int[5];
		for(int i =0; i<5; i++) {
			System.out.print("������ �Է��ϼ���: ");
			inputnum[i] = scan.nextInt();
		}
		return inputnum;
	}
	
	//���� �޼���
	public static int[] AscArray(int[] list) {
		for(int i=0; i< list.length;i++) {
			for(int k =i+1; k < list.length ; k++) {
				if(list[i]>list[k]) {
					int a=0;
					a = list[i];
					list[i] = list[k];
					list[k] = a;
				}
			}
		}
		return list;
	}

}

