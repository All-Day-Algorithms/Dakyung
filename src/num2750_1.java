//��������

import java.util.Scanner;

public class num2750_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] resultl = new int[5];
		resultl = InputArray(scan);
		printArray(AscArray(resultl));
		System.out.println();
		printArray(DesArray(resultl));
		
	}
	
	//�Է� �޼���
	public static int[] InputArray(Scanner scan) {
		int[] inputnum = new int[5];
		for(int i =0; i<5; i++) {
			System.out.print("������ �Է��ϼ���: ");
			inputnum[i] = scan.nextInt();
		}
		return inputnum;
	}
	
	//��������
	public static int[] AscArray(int[] inputnum) {
		int a =0;
		for(int k=0; k<4;k++) {
			if(inputnum[k] > inputnum[k+1]) {
				a = inputnum[k+1];  
				inputnum[k+1] = inputnum[k];
				inputnum[k] =a ;
			}
		}
		return inputnum;
	}
	
	//��������
	public static int[] DesArray(int[] inputnum) {
		int a =0;
		for(int k=0; k<4;k++) {
			if(inputnum[k] < inputnum[k+1]) {
				a = inputnum[k+1];  
				inputnum[k+1] = inputnum[k];
				inputnum[k] =a ;
			}
		}
		return inputnum;
	}
	
	//����Ʈ
	public static void printArray(int[] inputnum) {
		for(int i =0; i<5; i++) {
			System.out.print(inputnum[i]);
		}
	}

}
