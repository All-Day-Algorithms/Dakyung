import java.util.*;
public class num2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ncase = scan.nextInt();
		
		for(int i=0;i<ncase;i++) {
			int k=scan.nextInt();//��
			int n=scan.nextInt();//ȣ
			
			int[] listc= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};//��� ����Ʈ
			
			for(int m=0;m<k;m++) {
				int total =0;
				for(int s=0;s<n;s++) {
					total += listc[s];
					listc[s] = total; //������ ���� ���� ȣ���� �� ���� ������ �� ����
				}
			}
			System.out.println(listc[n-1]);
		}
	}
}
