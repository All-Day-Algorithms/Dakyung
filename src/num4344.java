/*
 ù° �ٿ��� �׽�Ʈ ���̽��� ���� C�� �־�����.
��° �ٺ��� �� �׽�Ʈ ���̽����� �л��� �� N(1 �� N �� 1000, N�� ����)�� ù ���� �־�����, �̾ N���� ������ �־�����. ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� ������
 */
import java.util.*;
public class num4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt(); //���̽� ���� �ޱ�
		int snum=0;
		double avg =0;
		int total = 0;
		int count =0;
		int[] list = new int[1000];
		
		for(int i=0;i<c;i++) {
			snum =scan.nextInt();
			list = new int[snum];
			for(int k=0; k<snum; k++) {
				list[k] = scan.nextInt(); //�� �ޱ�
				total = total + list[k]; //����
			}
			avg = (double)total/ snum; //���
			
			for(int v =0;v<snum;v++) {
				if(list[v]>avg) {
					count += 1; 
				}
			}

			double result = ((double)count/snum) * 100;
			
			 snum   = 0;
			 avg = 0;
			 total  = 0;
			 count  = 0;  //�� �ʱ�ȭ�ϱ� 
			 
			 System.out.printf("%.3f%%\n",result);
		}
	}
}

//import java.util.Scanner;
// 
//public class num4344{
// 
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int c = sc.nextInt();
//        int n, total, count;
//        double avg;
//        int scores[] = new int[1000];
//         
//        for (int i = 0; i < c; ++i) {
//            n = sc.nextInt();
//            total = 0;
//            count = 0;
//            for (int j = 0; j < n; ++j) {
//                scores[j] = sc.nextInt();
//                total += scores[j];
//            }
//            avg = (double)total / n;
//             
//            for (int j = 0; j < n; ++j) {
//                if (scores[j] > avg) {
//                    count++;
//                }
//            }
//            System.out.printf("%.3f", 100.0 * count / n);
//            System.out.println("%");
//        }
//        sc.close();
//    }
//}


