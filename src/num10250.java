import java.util.*;
public class num10250 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num =0; 
		int nheight=0, nwidth=0;
		int nperson =0;
		
		num=scan.nextInt(); //테스트 개수
		int result[] = new int[num]; //결과 넣을 리스트
		
		for(int i=0; i<num; i++) {
			int h=1;
			int c =0;
			nheight = scan.nextInt(); //층수
			nwidth = scan.nextInt(); //호수
			nperson = scan.nextInt(); //몇번째 사람
			
			for(int j=0; j < nperson; j++) {
				if(c >= nheight) {
					h++; 
					c =0;
				} //꼭대기 층수까지 다 올라가면 호수를 하나 올리고 , 다음 호수의 1층부터 다시 시작
				c++; //꼭대기 층수가 되기 전까지 층수를 올리는 것
			}
			result[i] = (c*100) + h; //c층의 h호
		}
		for(int k=0;k<num;k++) {
			System.out.println(result[k]);
		}
	}
}

