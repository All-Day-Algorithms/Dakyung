import java.util.*;
public class num2775 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ncase = scan.nextInt();
		
		for(int i=0;i<ncase;i++) {
			int k=scan.nextInt();//층
			int n=scan.nextInt();//호
			
			int[] listc= {1,2,3,4,5,6,7,8,9,10,11,12,13,14};//결과 리스트
			
			for(int m=0;m<k;m++) {
				int total =0;
				for(int s=0;s<n;s++) {
					total += listc[s];
					listc[s] = total; //현재층 기준 밑층 호수들 다 더한 값으로 값 변경
				}
			}
			System.out.println(listc[n-1]);
		}
	}
}
