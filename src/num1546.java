/*
 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
*/

import java.util.*;
public class num1546 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		double bests =0; //double로 써야함! int 아님!
		double total = 0;//double로 써야함! int 아님!
		
		double[] array1 = new double[N];
		for(int i=0;i<array1.length;i++) {
			array1[i] = scan.nextInt();
			if(array1[i] >= bests) {
				bests = array1[i];
			}
		}
		scan.close();
		
		for(int i=0;i<array1.length;i++) {	
			array1[i]= array1[i]/bests*100;
			total += array1[i];
		}
		System.out.println(total);
		double avg = total / N;
		System.out.println(avg);
	}	
}

