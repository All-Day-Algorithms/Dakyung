/*
 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이
 */
import java.util.*;
public class num4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt(); //케이스 개수 받기
		int snum=0;
		double avg =0;
		int total = 0;
		int count =0;
		int[] list = new int[1000];
		
		for(int i=0;i<c;i++) {
			snum =scan.nextInt();
			list = new int[snum];
			for(int k=0; k<snum; k++) {
				list[k] = scan.nextInt(); //값 받기
				total = total + list[k]; //총합
			}
			avg = (double)total/ snum; //평균
			
			for(int v =0;v<snum;v++) {
				if(list[v]>avg) {
					count += 1; 
				}
			}

			double result = ((double)count/snum) * 100;
			
			 snum   = 0;
			 avg = 0;
			 total  = 0;
			 count  = 0;  //다 초기화하기 
			 
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


