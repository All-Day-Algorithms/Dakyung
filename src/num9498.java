import java.util.*;

public class num9498 {

	public static void main(String[] args) {
		int score =0; //점수 저장 위한 변수
		
		Scanner scan =new Scanner(System.in);
		score =scan.nextInt();
		
		if(score >=90) {
			System.out.println('A');
		}else if(score >= 80) {
			System.out.println('B');
		}else if(score >=70) {
			System.out.println('C');
		}else if(score >= 60) {
			System.out.println('D');
		}else {
			System.out.println('F');
		}

	}

}


